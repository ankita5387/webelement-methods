package webelementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class isenabled {

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
	void testMethodisEnabled() throws InterruptedException
	{
		driver.get(url);
		
		driver.findElement(By.linkText("create an account")).click();
		
		System.out.println(driver.findElement(By.id("tdb1")).isEnabled());

	}
	
	}
	

