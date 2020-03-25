package automation;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class NewTab {
public void Test(){
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("https://www.amazon.in/");
	        

		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		element4.sendKeys("OnePlus");
		element4.submit();
	   	//CLick on the search button
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
		String str = element1.getText();
		Assert.assertTrue(str.contains("OnePlus"));
		element1.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"productTitle\"]"));
		String str2 = element2.getText();
		Assert.assertTrue(str2.contains("OnePlus 7T (Glacier Blue, 8GB RAM, Fluid AMOLED Display, 128GB Storage, 3800mAH Battery)"));
		System.out.println("Title of product is :OnePlus 7T (Glacier Blue, 8GB RAM, Fluid AMOLED Display, 128GB Storage, 3800mAH Battery)");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled());
		System.out.println("Add cart is enabled");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).isEnabled());
		System.out.println("Buy Now is enabled");

}
}

