package ToolsQA.DemoMavenEclipseProject;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import weka.core.pmml.jaxbbindings.Output;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");

		/*
		 File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		File Destination = new File("C:\\Users\\sujata\\OneDrive\\Desktop\\Screenshots\\abc.jpg");
		FileHandler.copy(Source, Destination);
		*/
		
		// Radio Butto Example---------------------------
		WebElement radio1 = driver.findElement(By.xpath("//input[@value=\"radio1\"]"));
		radio1.click();
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.xpath("//input[@value=\"radio2\"]"));
		radio2.click();
		Thread.sleep(2000);
		WebElement radio3 = driver.findElement(By.xpath("//input[@value=\"radio3\"]"));
		radio3.click();
		// Checkbox Example---------------------------------
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		Thread.sleep(2000);
		WebElement checkbox2 = driver.findElement(By.id("checkBoxOption2"));
		checkbox2.click();
		// Window Handling-------------------
		
		driver.findElement(By.id("openwindow")).click();
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is :" +MainWindow);
		
		Set<String>s1=driver.getWindowHandles();
		System.out.println("Child window handle is :" +s1);
		//driver.switchTo().window(MainWindow);
		
		
		
		
		
		
	}

}
