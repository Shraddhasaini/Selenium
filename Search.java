package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class Search {
public void Test(){
		//declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shrad\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    	//Launch  Website
	        driver.navigate().to("https://in.burberry.com/");
	        
			WebElement element20 = driver.findElement(By.xpath("//*[@id=\"navigation-search-link\"]/i"));
			element20.click();
	        
		//WebElement element2 = driver.findElement(By.xpath("//*[@id=\"header-main\"]/div[2]/a[2]"));
		//	element2.click();

		WebElement element4 = driver.findElement(By.xpath("//*[@id='search-input']"));
		element4.sendKeys("Dresses");
		element4.submit();
	   	//CLick on the search button
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"facet-result-render\"]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/p/a"));
		String str = element1.getText();
		Assert.assertTrue(str.contains("Dress"));
		element1.click();
	}
}

