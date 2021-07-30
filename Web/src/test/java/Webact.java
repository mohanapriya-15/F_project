import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Webact {

	@Test
	public void action() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.id("draggable"));
		
		WebElement ele1 = driver.findElement(By.id("droppable"));
	
		act.dragAndDrop(ele, ele1).build().perform();
		act.dragAndDropBy(ele, 90, 70).build().perform();
	}

}

