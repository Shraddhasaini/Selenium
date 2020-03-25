package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegisterAmazon {

	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("http://www.amazon.in/register");

		WebElement element1 = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
	   	element1.sendKeys("Shraddha");
		element1.submit();
		WebElement element2 = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	   	element2.sendKeys("8708391833");
		element2.submit();
			
		WebElement element5 = driver.findElement(By.xpath("//input[@id='ap_email']"));
	   	element5.sendKeys("500062194@stu.upes.ac.in");
		element5.submit();
		
		WebElement element3 = driver.findElement(By.xpath("//input[@id='ap_password']"));
	   	element3.sendKeys("password");
		element3.submit();

		WebElement element4 = driver.findElement(By.id("continue.a-button-input"));
		element4.click();
	   	//CLick on the search button
	}

}
