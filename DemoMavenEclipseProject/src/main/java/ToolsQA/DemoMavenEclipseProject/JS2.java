package ToolsQA.DemoMavenEclipseProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class JS2 {

		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");	
			
			JavascriptExecutor js = (JavascriptExecutor) driver ;
			js.executeScript("document.getElementById('email').value='ddd'");  // without using sendKeys 
			js.executeScript("document.getElementById('pass').value='abc'");
		
			WebElement button = driver.findElement(By.xpath("//button[@type = 'submit']"));
			 js.executeScript("arguments[0].click();", button);
			
			//scroll down by 600  pixels	
			js.executeScript("window.scrollBy(0,600)");	
			
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,-200)"); // scrolling up by -200
			
	}

}
