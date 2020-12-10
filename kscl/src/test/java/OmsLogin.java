

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OmsLogin {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		String homepage;
		homepage="https://wms.gscmaven.com/#/wmslogin";
	     WebDriver driver;
	         System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         //Using get() method to open a webpage
	         driver.get(homepage);
	         driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     WebElement w=driver.findElement(By.id("loginEmail"));
	     w.sendKeys("dixit");
	     WebElement pwd=driver.findElement(By.id("loginPassword"));
	     pwd.sendKeys("glaucus123");
	     //String ermsg="An account using this email address has already been registered. Please enter a valid password or request a new one.";
	   //  boolean flag = false;
	     WebElement submit=driver.findElement(By.id("loginSubmit"));
	     submit.click();
	     
	     
	     
	        Select warehouse = new Select(driver.findElement(By.xpath("//select[@name='warehouse']")));
	        warehouse.selectByIndex(1);
	        
	        Select client = new Select(driver.findElement(By.xpath("//select[@name='client']")));
	        client.selectByVisibleText("Maven Demo");;
	        
	        WebElement next=driver.findElement(By.xpath("//input[@type='submit']"));
		     next.click();;
	        
		     Actions a = new Actions(driver);
		     
		     
		     WebElement we= driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/wms-dashboard[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		    
	          a.moveToElement(we).click(we).build().perform();
	      

	          WebElement calend = driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/wms-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/md-datepicker[1]/button[1]"));
	          
	          calend.click();
	          
	          WebElement date = driver.findElement(By.xpath("//td[contains(@id,'md-')]//span[@class='md-calendar-date-selection-indicator'][contains(text(),'8')]"));
	         date.click();
	           
	         //  List<WebElement> dates= driver.findElement(By.xpath("/html[1]/body[1]/ui-view[1]/wms-dashboard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/md-datepicker[1]/button[1]"));   
	         WebElement todate = driver.findElement(By.xpath("//span[contains(text(),'15')]"));
	         todate.click();
	         WebElement search = driver.findElement(By.xpath("//button[@id='invSearch']"));
	         search.click();
	         
	        //td[@id='md-16-month-2020-8-7']//span[@class='md-calendar-date-selection-indicator'][contains(text(),'7')]

	}
			  
	
}
			
