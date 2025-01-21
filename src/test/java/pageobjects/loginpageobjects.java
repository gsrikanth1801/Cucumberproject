package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobjects {
	
	public WebDriver dr;
	
	public loginpageobjects(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	
	@FindBy(xpath= "//input[@name='username']")
	 WebElement userinput;
	
	@FindBy(xpath= "//input[@name='password']")
	 WebElement userpwd;
	
//	public WebElement userinput = dr.findElement(By.xpath("//input[@name='username']"));
	
	public void enterCredentials(String s, String s2) {
		userinput.clear();
		userinput.sendKeys(s);
	
		userpwd.clear();
		userpwd.sendKeys(s);
	}

}
