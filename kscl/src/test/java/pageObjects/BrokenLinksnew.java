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

public class BrokenLinksnew 

{
	public static void main(String[] args) 
	{
		WebDriver driver;
		String homePage = "http://1.23.183.194:4110";
		System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
        //WebDriverManager.chromedriver().version("84.0.4147.30").setup();
        //Instantiating driver object and launching browser  
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Using get() method to open a webpage
        driver.get(homePage);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       
        WebElement w=driver.findElement(By.xpath(("//input[@placeholder='Username']")));
	     w.sendKeys("msp");
	     WebElement pwdw=driver.findElement(By.xpath(("//input[@type='password']")));
	     pwdw.sendKeys("msp");
        
	     WebElement clickbtn=driver.findElement(By.xpath(("//button[@class='btn btn-success']")));
	     clickbtn.click();
        //driver.findElement(By.xpath("xpath here")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement ele= links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
	}
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           httpURLConnect.setConnectTimeout(3000);
           httpURLConnect.connect();
           System.out.println(httpURLConnect.getRequestMethod());
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
        
    } 
}
	 

