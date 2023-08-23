package ToolsQA.DemoMavenEclipseProject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleDemo{
	
	public static void main(String args[]) {
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));  //...Implicit wait.............
		driver.get("https://www.carwale.com/");
		
		
		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sujata@12345");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();  
		*/
		//driver.findElement(By.id("email")).sendKeys("sujata@12345");
		//driver.findElement(By.id("pass")).sendKeys("12345");
		
		
	}
}