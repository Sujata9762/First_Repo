package ToolsQA.DemoMavenEclipseProject;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3);
		//WebElement tab = driver.findElement(By.id("tabButton"));
		//tab.click();
		
		WebElement window = driver.findElement(By.id("windowButton"));
		window.click();
		//System.out.println("window tab is clicked..");
		
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window handle ID is :" +mainWindow);  // to get window ID --- IMP Interview Question
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Child Window Handle ID is:" +s1);		// to get child window ID ----
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
