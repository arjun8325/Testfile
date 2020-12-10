package pageObjects;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registeration {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String homepage;
		homepage="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	     WebDriver driver;
	         System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         //Using get() method to open a webpage
	         driver.get(homepage);
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     WebElement w=driver.findElement(By.id("email_create"));
	     w.sendKeys("arjundiwan.223@gmail.com");
	     WebElement button=driver.findElement(By.name("SubmitCreate"));
	     button.click();
	     //String ermsg="An account using this email address has already been registered. Please enter a valid password or request a new one.";
	   //  boolean flag = false;
	     
	     WebElement radio=driver.findElement(By.xpath("//input[@id='id_gender1']"));
	        radio.click();
	        WebElement fname=driver.findElement(By.xpath("//input[@id='customer_firstname']"));
	        fname.sendKeys("aj");
	        WebElement lname=driver.findElement(By.xpath("//input[@id='customer_lastname']"));
	        lname.sendKeys("Diwan");
	        WebElement pwd=driver.findElement(By.id("passwd"));
	        pwd.sendKeys("Diwan@54321");
	        WebElement adress=driver.findElement(By.id("address1"));
	        adress.sendKeys("8 ,Model town");
	        WebElement city=driver.findElement(By.id("city"));
	        city.sendKeys("delhi");
	       
	        Select oSelect = new Select(driver.findElement(By.id("id_state")));
	        oSelect.selectByVisibleText("Arizona");
	        WebElement pcode = driver.findElement(By.id("postcode"));
	        pcode.sendKeys("11111");
	        WebElement phone = driver.findElement(By.id("phone_mobile"));
	        phone.sendKeys("98765431");
	        WebElement submit=driver.findElement(By.name("submitAccount"));
	        submit.click();
	        
	        


	}

}
