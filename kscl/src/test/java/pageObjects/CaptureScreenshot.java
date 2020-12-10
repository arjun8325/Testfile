package pageObjects;

 import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import org.testng.annotations.Test;


public class CaptureScreenshot {

	
	public static void captureScreenMethod() throws Exception{
	System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(((TakesScreenshot)driver).getClass()); 
	FileUtils.copyFile(screenshotFile, new File("E:\\SoftwareTestingMaterial.png"));
	driver.close();
	driver.quit();
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) throws Exception 
	{
	
		captureScreenMethod();
	}

}
