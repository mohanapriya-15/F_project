package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Element.Attributes1;

public class Pagefunction {



  @Test
  public void f() {
      
      System.setProperty("webdriver.chrome.driver","C:\\Users\\mohanapriya_p\\Downloads\\chromedriver_win32 (3)\\Chromedriver.exe");
        WebDriver driver;
        
        driver= new ChromeDriver();
        
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        
        PageFactory.initElements(driver, Attributes1.class);
        
        Attributes1.emailid.sendKeys("mohana@gmail.com");
        Attributes1.login_button.click();
        
        
  }
}

