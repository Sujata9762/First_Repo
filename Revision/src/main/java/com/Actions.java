package com;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.ActionsHelper;
import Helper.Locators;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Locators locator = new Locators();
		ActionsHelper actionhelper = new ActionsHelper();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
		driver.get("https://www.saucedemo.com/");
	    actionhelper.snapshot(driver,"SS1");
		
		WebElement username = driver.findElement(By.xpath(locator.USERNAME));
		username.sendKeys("standard_user");
		actionhelper.snapshot(driver,"SS2");
		
		WebElement Password = driver.findElement(By.xpath(locator.PASSWORD));
		Password.sendKeys("secret_sauce");
		actionhelper.snapshot(driver,"SS3");
		
		WebElement Login = driver.findElement(By.xpath(locator.Login));
		Login.click();
		actionhelper.snapshot(driver,"SS4");
		
		WebElement CLICKPRODUCT = driver.findElement(By.xpath(locator.CLICKPRODUCT));
		CLICKPRODUCT.click();
		
		WebElement AddToCart = driver.findElement(By.xpath(locator.AddToCart));
		AddToCart.click();
		
		WebElement GoToCart = driver.findElement(By.xpath(locator.GoToCart));
		GoToCart.click();
		
		WebElement Checkout = driver.findElement(By.xpath(locator.Checkout));
		Checkout.click();

	}
}
