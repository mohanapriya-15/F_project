import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
//import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Orderwithscreen {
	
	@Test
	public void screenshotorder() throws IOException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/mohanapriya_p/Downloads/chromedriver_win32/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.findElement(By.xpath("//a[@href='#Serialize']")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='SerializeFunc']//li"));
		
		int size = ele.size();
		System.out.println(size);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL)
		.click(ele.get(0))
		.click(ele.get(3))
		.click(ele.get(5))
		.build().perform();
		
		
		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\mohanapriya_p\\OneDrive - HCL Technologies Ltd\\Desktop\\Screenshot\\screnn.jpg");
		FileHandler.copy(srcFile, destFile);

		Robot r1 = new Robot();
		
		Dimension s_size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(s_size);
		BufferedImage src= r1.createScreenCapture(rect);
		File destFile1 = new File("C:\\Users\\mohanapriya_p\\OneDrive - HCL Technologies Ltd\\Desktop\\Screenshot\\scr.jpg");
		ImageIO.write(src, "jpg", destFile1);
	
	}
	
	
}
