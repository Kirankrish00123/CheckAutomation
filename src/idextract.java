import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class idextract {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverWait wait;
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.get("https://fanhood.martmonk.com/website/productManagement/products");
		driver.findElement(By.id("userName")).sendKeys("marmeto");
		driver.findElement(By.id("password")).sendKeys("mmto1#1*");
		driver.findElement(By.id("signInButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		Thread.sleep(3000);
	
		
		js.executeScript("window.scrollBy(0,1000)");
		//WebElement elem= driver.findElement(By.xpath("//*[@id='productsList_next']"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].click()", elem);
		//Thread.sleep(6000);
		List<WebElement> element = driver.findElements(By.xpath("//*[@id='productsList']/tbody/tr"));

		for(WebElement ele:element)
		{
                String id = ele.getAttribute("id");
		        System.out.println(id);
		}
		  
		
	}

}

	

		