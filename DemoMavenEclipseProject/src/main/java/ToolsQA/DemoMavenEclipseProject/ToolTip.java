package ToolsQA.DemoMavenEclipseProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String ActualTooltip = driver.findElement(By.xpath("//a[@href = '/reg/']")).getAttribute("title");
				
				String ExpectedTooltip = "Sign up for facebook";
		
				if(ActualTooltip.equalsIgnoreCase(ExpectedTooltip))
				{
				System.out.println("Test Passed");
				}
				else
				{
				System.out.println("Test Failed");
				}
	}

}
