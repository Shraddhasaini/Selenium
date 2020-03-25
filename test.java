package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test 
{
    public static void main(String[] args) throws InterruptedException {
 	//declaration and instantiation of objects/variables
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    	//Launch  Website
        driver.navigate().to("http://www.google.com/");

	//Click on the search text box and send value
	WebElement element = driver.findElement(By.name("q"));
   	element.sendKeys("javatpoint tutorials");
	element.submit();

   	//CLick on the search button
}
}