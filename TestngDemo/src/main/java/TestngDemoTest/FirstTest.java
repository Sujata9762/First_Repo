package TestngDemoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void m1() 
	{
	
		System.out.println("Lounching Browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		String expectedTitle= "Online Selenium Certification Course [#1 Selenium Training]";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		//driver.close();
	}
	

}
