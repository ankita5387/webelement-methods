package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class isselect {

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
	void testMethodisSelected() throws InterruptedException
	{
		driver.get(url);
		
		driver.findElement(By.linkText("create an account")).click();
		
		boolean beforeClicking = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
		
		System.out.println("Before->"+beforeClicking);
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		
		boolean afterClicking = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
		
		System.out.println("After->"+afterClicking);

	}	
	
}
