package Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attributes {
		@FindBy(xpath="//input[@type='email']")
		public static WebElement email;
		public static WebElement email(WebDriver driver) {
			return driver.findElement(By.xpath("//input[@type='email']"));
			
		}
		@FindBy(xpath="//span[@class='VfPpkd-vQzf8d']")
		public static WebElement next;
		public static WebElement next(WebDriver driver) {
			return driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));

		
		}
		}
