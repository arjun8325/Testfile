package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

 
public class FirstPage {
 
	
    public static void main(String[] args) throws InterruptedException {
         
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
    ///    driver.manage().timeouts().implicitlyWait(5, 5000);
        
    
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
        //WebDriverManager.chromedriver().version("84.0.4147.30").setup();
        //Instantiating driver object and launching browser  
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        //Using get() method to open a webpage
        driver.get("http://1.23.183.194/");
        
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(10000);
        
        List<WebElement> bb=driver.findElements(By.tagName("a"));
       int a= bb.size();
        System.out.println(a);
        
        for(WebElement links:bb)
        {
        	System.out.println(links.getText() +" " +links.getAttribute("href"));
        }
        driver.quit();
        //Closing the browser
        
      
    }
  
}