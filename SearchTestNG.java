package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchTestNG {
  public static WebDriver driver;
//  public static WebElement element;
  public static String str,s1;

@BeforeTest
 public void beforeTest() {
 
 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shrad\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
   driver.navigate().to("https://www.amazon.in");

 }



@Test
  public void f() {
 
WebDriver driver= new ChromeDriver();
   driver.navigate().to("https://www.amazon.in");
WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
element.sendKeys("iphone");
element.submit();
element = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span"));
s1= element.getText();
Assert.assertTrue(s1.contains("iPhone"));
element.click();
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));

str = driver.findElement(By.id("productTitle")).getText();
Assert.assertTrue(str.contains("iPhone"));
//str = driver.findElement(By.id("priceblock_ourprice_lbl")).getText();
//Assert.assertTrue(str.contains("Price"));
str = driver.findElement(By.xpath("//*[@id=\"ddmDeliveryMessage\"]")).getText();
Assert.assertTrue(str.contains("Delivery"));
//str = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).getText(); //Button elements cannot check content. Check if enabled
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled());
Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).isEnabled());
 
  }
 
 
  @AfterTest
  public void afterTest() {
 
 System.out.println("No errors, code executed successfully");

// Close the driver
driver.quit();
  }
}