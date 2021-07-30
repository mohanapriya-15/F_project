import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Unorderwithscsh {

		@Test
		public void unoreder() {
			
			System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/AutoComplete.html");
			driver.findElement(By.id("searchbox")).sendKeys("In");
			List<WebElement> ele1= driver.findElements(By.xpath("//div[@id='menucontainer']//ul//li"));
			int size = ele1.size();
			System.out.println(size);
			
			for(int j=0; j<size; j++)
			{
				if(ele1.get(j).getText().equalsIgnoreCase("India")) {
					String tt = ele1.get(j).getText();
					ele1.get(j).click();
					System.out.println("Country clicked is" +tt);
				}
			}
		}
}
