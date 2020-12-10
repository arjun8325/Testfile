package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;


public class FbRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
     
    System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
		 
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        //Using get() method to open a webpage
        driver.get("https://www.facebook.com/r.php");
        WebElement male_radio_button=driver.findElement(By.id("u_0_4"));
        
        boolean status=male_radio_button.isDisplayed();

        System.out.println("Male radio button is Displayed >>"+status);

         boolean enabled_status=male_radio_button.isEnabled();

         System.out.println("Male radio button is Enabled >>"+enabled_status);

       boolean selected_status=male_radio_button.isSelected();

         System.out.println("Male radio button is Selected >>"+selected_status);

         male_radio_button.click();

       boolean selected_status_new=male_radio_button.isSelected();

         System.out.println("Male radio button is Selected >>"+selected_status_new);

	}

}
