package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Element.Attributes;

public class Fucntion {

	@Test
	public void email() {
		
	
	System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	PageFactory.initElements(driver, Attributes.class);
	Attributes.email(driver).sendKeys("mohanapalani@gmail.com");
	Attributes.next(driver).click();
	
	}
}
