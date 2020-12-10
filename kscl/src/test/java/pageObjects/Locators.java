package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Locators {
 
	public static void main(String[] args) {
		
		// Setting browser driver property 
		System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
		// Opening chrome browser
		WebDriver driver= new ChromeDriver();
		// Opening URL
		driver.get("https://www.facebook.com");
		//Locating a web element using id
		WebElement emailTextBox= driver.findElement(By.id("email"));
		
		System.out.println(emailTextBox.getText());
		// Checking if element is displayed
		boolean flagDisplayed= emailTextBox.isDisplayed();
		if(flagDisplayed==true)
			System.out.println("Element is displayed.");
		else
			System.out.println("Element is not diplayed.");
		
		// Checking if element is enable
		boolean flagEnable= emailTextBox.isEnabled();
		if(flagEnable==true)
			System.out.println("Element is displayed.");
		else
			System.out.println("Element is not diplayed.");
		// Typing in text box
		if(flagDisplayed== true & flagEnable==true )
		{
			emailTextBox.sendKeys("amod.mahajan@hotmail.com");
			// Retrieving typed value
			String typedValue= emailTextBox.getAttribute("value");
			if(typedValue.equals("amod.mahajan@hotmail.com"))
				System.out.println("Correc value is typed.");
			else
				System.out.println("Incorrect value typed. Typed value is:"+typedValue);
		}
		else
			System.out.println("Element is either not displayed or enabled.");
	}
}