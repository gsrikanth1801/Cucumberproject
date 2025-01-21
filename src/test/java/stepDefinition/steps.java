package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageobjects.loginpageobjects;

public class steps {
	
	loginpageobjects LPO = new loginpageobjects();
	WebDriver driver = LPO.dr;
	
	
	
//	public WebDriver dr= new ChromeDriver();
	
	@Given("Launch Browser")
	public void launch_browser() {
	     
		System.out.println("Launchibg browser");
		
	     
	}

	@When("user opens URL {string}")
	public void user_opens_url(String string) {
	     
	     driver.get(string);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		LPO.enterUserName(string);
	     
	     
	    LPO.enterPwd(string2);
	}

	@When("click on login")
	public void click_on_login() {
		 WebElement Loginbutton = driver.findElement(By.xpath("//*[@type='submit']"));
		 Loginbutton.click();
		
		
	     
	     
	}

	@Then("page should be opened")
	public void page_should_be_opened() throws InterruptedException {
		Thread.sleep(2000);
	}

	@When("user click log out")
	public void user_click_log_out() {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
	     driver.findElement(By.xpath("//a[text()='Logout']")).click();
	     
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
	     
	     String Acttitle=driver.getTitle();
	     Assert.assertEquals(ExpectedTitle, Acttitle);
	     System.out.println(Acttitle);
	}

	@Then("close browser")
	public void close_browser() {
	     
	     driver.quit();
	}

}
