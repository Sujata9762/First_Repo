package ToolsQA.DemoMavenEclipseProject;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locaters {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.linkText("Best Sellers"));
		Element.click();
		//driver.findElement(By.partialLinkText("Hot New")).click();
		
		
	}

}
