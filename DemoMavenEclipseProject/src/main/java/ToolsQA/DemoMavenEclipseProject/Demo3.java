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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12456987");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_97w4\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _aklv _4jy3 _517h _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@name=\"reset_action\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Sujata");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Lokhande");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("lokhande.sujata12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("lokhande.sujata12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("321654987");
		Thread.sleep(2000);
		//----------ListBox/DropDown List------------------
		
		WebElement date = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		Select s = new Select(date);
		Thread.sleep(3000);
		s.selectByValue("5");
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		Select s1 = new Select(month);
		Thread.sleep(3000);
		s1.selectByVisibleText("Aug");
		
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select s2 = new Select(year);
		Thread.sleep(3000);
		s2.selectByIndex(30);
		
		//--------------Radio Button ------------------------------
		
		WebElement radio1 = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
		radio1.click();
		Thread.sleep(5000);
		
		//---------------Scroll Down---------
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id=\"u_0_s_3x\"]")).click();
		
		
	}

}
