package ToolsQA.DemoMavenEclipseProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class JS1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)"); // scrollvertically down

		// Scroll till visibility of element
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'Ideal Weight Calculator']"));
		jse.executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(5000);

		WebElement bmi = driver.findElement(By.xpath("//a[text() = 'BMI Calculator']"));
		jse.executeScript("arguments[0].scrollIntoView();", bmi);

		// To scroll down at the bottom of the web page
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");  

	}

}
