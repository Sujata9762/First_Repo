package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String args[]) {
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");	
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scrollBy(0,3000)");
		
		String title = driver.getTitle();
		System.out.println("The page title is :" +title); */
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
	}
}
