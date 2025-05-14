package M2P_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
	public static void main(String[]args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		
		 String title = driver.getTitle();
         if (title.contains("Selenium")) {
        	 
             System.out.println("Successfully  Page title  'Selenium'");
         } else {
             System.out.println("Failure Page title does not contain 'Selenium'");
         }
		
         driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
         
         String currentUrl = driver.getCurrentUrl();
         
         if (currentUrl.contains("downloads")) {
        	 
             System.out.println("Print the Success  ");
         } else {
             System.out.println("Print the Fail");
         }
         driver.quit();
    
		
	}

}
