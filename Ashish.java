package automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Ashish {
public void Test(){
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("https://web.whatsapp.com/");
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[1]"));
		element2.click();
		
		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
		element5.sendKeys("I LOVE YOU -sent automatically using selenium script");
		element5.sendKeys(Keys.ENTER);
		

	}
}

