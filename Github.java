package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Github {

	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("https://github.com/join?source=header-home");

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
	   	element1.sendKeys("Shraddha123456789");
		element1.submit();

			
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
	   	element2.sendKeys("500062194@stu.upes.ac.in");
		element2.submit();
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));
	   	element3.sendKeys("password987654321password");
		element3.submit();

		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"signup_button\"]"));
		element4.click();

	}

}
