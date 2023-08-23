package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {

	public static void main(String[] args) throws InterruptedException {


			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice");
			
			WebElement Example1 = driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
			Select s1 = new Select(Example1);
			s1.selectByVisibleText("Option1");
			Thread.sleep(3000);
			s1.selectByIndex(2);
			Thread.sleep(3000);
			s1.selectByValue("option3");
			Thread.sleep(3000);
			
			WebElement textbox = driver.findElement(By.id("autocomplete"));
			textbox.sendKeys("Hello sujata");
	}

}
