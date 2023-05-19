package baseClasses;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBPageTest {
	
	WebDriver driver;
	@Test
	public void demoTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		Assert.assertEquals("Amar", "Amar");
		
		
	}
	
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amar.genius@yahoo.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Goalreminder12!");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}
	

}

