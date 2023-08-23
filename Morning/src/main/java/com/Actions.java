package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Helper.Locaters_Define;

public class Actions {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		Locaters_Define locators = new Locaters_Define();
		
		
		WebElement username = driver.findElement(By.xpath(locators.USERNAME));
		username.sendKeys("Sujata");
		
		WebElement password = driver.findElement(By.xpath(locators.PASSWORD));
		password.sendKeys("12345");
		
		WebElement Login = driver.findElement(By.xpath(locators.LOGIN));
		Login.click();
		
		
		
		
		
		
		
		
	}

}
