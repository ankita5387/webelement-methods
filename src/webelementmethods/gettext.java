package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gettext {
	WebDriver driver;
	String url = "http://122.170.14.195:8080/uth/gadgetsgallery/catalog/";
	
	@BeforeTest
	void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	void testgetTextMethod()
	{
		driver.get(url);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h1"));
		String elementText = element.getText();
		System.out.println("1->"+elementText);
		
		driver.findElement(By.linkText("Headphones")).click();
		System.out.println("Category Selected->"+driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/h1")).getText());
		
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[2]/a")).getText()+"---"+driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[1]/div[2]/table/tbody/tr[4]/td[3]")).getText());
		
	}
	
}
