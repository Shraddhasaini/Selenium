package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomationTC
{
    public static void main(String[] args) throws InterruptedException {
 	//declaration and instantiation of objects/variables
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
    	//Launch  Website
        driver.navigate().to("http://www.amazon.in/");

	//Click on the search text box and send value
	WebElement element = driver.findElement(By.id("nav-signin-tooltip"));
	element.click();
	WebElement element1 = driver.findElement(By.id("ap_email"));
   	element1.sendKeys("9416978333");
	element1.submit();
	WebElement element2 = driver.findElement(By.id("ap_password"));
   	element2.sendKeys("shraddha");
	element2.submit();

	WebElement element3 = driver.findElement(By.id("nav-item-signout"));
	element3.click();
   	//CLick on the search button
}

}