package pageObjects;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;



public class BrokenLinks {

	

	
	public static void main(String[] args) {
		
		
		
		String homePage = "http://www.smartcity.karnal.gov.in";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

		  WebDriver driver;
		  		        //Setting webdriver.gecko.driver property
		        System.setProperty("webdriver.chrome.driver", "E://driveeee//chromedriver.exe");
		        //WebDriverManager.chromedriver().version("84.0.4147.30").setup();
		        //Instantiating driver object and launching browser  
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        //Using get() method to open a webpage
		        driver.get(homePage);
		        driver.manage().deleteAllCookies();
		        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		       // String title=driver.getTitle();
		        List<WebElement> links = driver.findElements(By.tagName("a"));
		        
		        Iterator<WebElement> it = links.iterator();
		        
		        while(it.hasNext()){
		            
		            url = it.next().getAttribute("href");
		            
		            System.out.println(url);
		        
		            if(url == null || url.isEmpty()){
		System.out.println("URL is either not configured for anchor tag or it is empty");
		                continue;
		            }
		            
		            if(!url.startsWith(homePage)){
		                System.out.println("URL belongs to another domain, skipping it.");
		                continue;
		            }
		            
		            try {
		                huc = (HttpURLConnection)(new URL(url).openConnection());
		                
		                huc.setRequestMethod("HEAD");
		                
		                huc.connect();
		                
		                respCode = huc.getResponseCode();
		                
		                if(respCode >= 400){
		                    System.out.println(url+" is a broken link");
		                }
		                else{
		                    System.out.println(url+" is a valid link");
		                }
		                    
		            } catch (MalformedURLException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            } catch (IOException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }
		        }
		        
		   
		        driver.quit();

	}

}
