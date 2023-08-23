package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelePractice {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	// Methods of WebDriver--------------
	
	//driver.get("https://www.flipkart.com");  .............To open particular browser....
	driver.manage().window().maximize();
	driver.navigate().to("https://www.flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	String title = driver.getTitle();
	System.out.println(title);
	
	/*String page = driver.getPageSource();    ..........to get page source code..........
	System.out.println(page);
	
	Dimension d = new Dimension(300,500); 
	driver.manage().window().setSize(d);
	
	Point p = new Point(600,300);
	driver.manage().window().setPosition(p);    */
	
	driver.close();   //..........to close current window/tab
	driver.quit();		//........to close all window/tabs/browser open by selenium.........
	
	
	}

}
 