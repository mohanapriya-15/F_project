//import java.awt.List;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class unord {

	@Test()
	public void f1() {



      
        System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
        WebDriver driver;
        driver= new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://demo.automationtesting.in/AutoComplete.html");
        //d1.findElement(By.id("tags")).sendKeys("A");

 

        
        WebElement el=driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']/input"));
        el.click();
        el.sendKeys("a");
        List<WebElement> elei=driver.findElements(By.xpath("//div[@id='menucontainer']/ul/li/a"));
        int n=elei.size();
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            if((elei.get(i)).getText().equalsIgnoreCase("Albania"))
            {
                (elei.get(i)).click();
            
            }
        }    

 

        
        
        /*//((WebElement) d1.findElements(By.xpath("//a[@href='Widgets.html']"))).click();
        //((WebElement) d1.findElements(By.xpath("//a[@href='AutoComplete.html']"))).click();
        WebElement entertext=d1.findElement(By.id("searchbox"));
        entertext.sendKeys("A");
        
        List<WebElement> ele1= d1.findElements(By.xpath("//li[@class='ui-menu-item']"));
        
        int size1=ele1.size();
        System.out.println(size1);
        for(WebElement element_value :ele1) {
            if(element_value.getText().equalsIgnoreCase("Austria")) {
                element_value.click();
                break;
                */
                
            }
        
  




	}
	

