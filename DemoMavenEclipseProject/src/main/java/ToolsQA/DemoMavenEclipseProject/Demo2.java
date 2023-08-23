package ToolsQA.DemoMavenEclipseProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.close();
		//driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345678");
		//driver.findElement(By.xpath("//button[@name=\"login\"]")).submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"identify_email\"]")).sendKeys("ascv@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Not you?\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _9o1w\"]")).sendKeys("abc@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _aklv _4jy3 _517h _51sy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _9nq1 textPadding13px _4jy3 _517h _51sy\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@name=\"reset_action\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Cancel\"]")).click();
	}

}
