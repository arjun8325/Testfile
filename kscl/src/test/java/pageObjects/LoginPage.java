package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
 * 
 * 
 * 
 * THiS page store all the locators 
 */


public class LoginPage{
	
	WebDriver driver;
	
	By username=By.id("");
	By password=By.xpath("");
	By loginbutton=By.name("");
	
	
	
	public LoginPage(WebDriver driver)
	{
		
	this.driver=driver;
		
	}
	
	public void typerusername()
	{
		
	}
	
	

}

	
	
