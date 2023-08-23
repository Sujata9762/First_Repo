package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:adminthe-internet.herokuapp.com/basic_auth");
		
	}

}
