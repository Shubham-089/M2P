package M2P_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearch {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement Search = driver.findElement(By.id("small-searchterms"));
        Search.sendKeys("Laptop");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
       
        
        
        String expectedURL = "https://demowebshop.tricentis.com/search?q=Laptop";
        String currentURl = driver.getCurrentUrl();
        
        if(currentURl.contains("https://demowebshop.tricentis.com/search?q=Laptop")){
           System.out.println("Search Successfully");
        }else{
           System.out.println("Search Failed");
       }
       
       driver.findElement(By.cssSelector("[class='product-title']")).click();
       
       driver.findElement(By.id("add-to-cart-button-31")).click();
       Thread.sleep(2000);

      
        driver.findElement(By.xpath("//li[@id=\"topcartlink\"]")).click();
        
        WebElement cart = driver.findElement(By.cssSelector(".product-name"));
        
        if (cart.getText().contains("Laptop")){
        	
            System.out.println("product add");
        }else{
            System.out.println("Failed Product");
        }
		
	}

}
