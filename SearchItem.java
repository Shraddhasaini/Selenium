package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchItem {
	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("http://www.amazon.in/");

		WebElement element4 = driver.findElement(By.xpath("//img[@class='product-image']"));
		element4.click();
	   	//CLick on the search button
	}
}
