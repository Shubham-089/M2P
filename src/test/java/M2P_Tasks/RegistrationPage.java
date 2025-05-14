package M2P_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationPage {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void registerPage() {
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Yetonde");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shubhamyetonde865@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@12345");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password@12345");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}
		
		@AfterMethod
		public void teardown() throws InterruptedException {
			Thread.sleep(6000);
			driver.quit();
	}

}
