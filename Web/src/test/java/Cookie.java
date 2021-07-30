import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Cookie {
	
	@Test()
	
		
		 
		    public void f() throws IOException {

		 

		        WebDriver d1;
		        FileInputStream f1=new FileInputStream("src\\test\\java\\Config.properties");

		 

		        Properties prop=new Properties();

		 

		        prop.load(f1);

		 

		        String browser_name=prop.getProperty("browser");
		        String driver_path=prop.getProperty("path");

		 

		        if(browser_name.equalsIgnoreCase("chrome"))
		        {
		            System.setProperty("webdriver.chrome.driver",driver_path);
		            
		            d1=new ChromeDriver();

		 

		        }
		        else if(browser_name.equalsIgnoreCase("firefox"))
		        {
		            
		            System.setProperty("webdriver.gecko.driver",driver_path);
		            d1=new FirefoxDriver();
		        }
		        else
		        {
		            System.setProperty("webdriver.ie.driver",driver_path);
		            
		            d1=new InternetExplorerDriver(); 
		        }

		 


		        d1.get("http://www.leafground.com/pages/tooltip.html");

		 

		        WebElement el1=d1.findElement(By.id("age"));

		 

		        String msg=el1.getAttribute("title");

		 


		        System.out.println(msg);

		 


		    }
		
		 
	}

