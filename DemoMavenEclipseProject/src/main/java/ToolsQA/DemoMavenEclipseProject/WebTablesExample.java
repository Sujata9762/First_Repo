package ToolsQA.DemoMavenEclipseProject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class WebTablesExample {
		
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("D:\\study material\\HTML\\Demo1.html");

		WebElement element = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[1]"));
		//element.getText();
		System.out.println("Data : " +element.getText());

		List<WebElement> data1 = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th[1]"));
		System.out.println("Data1:" +data1.size());
		
		List<WebElement> data2 = driver.findElements(By.xpath("//table//tbody/tr[7]/td[3]"));
		System.out.println("Data2 :" +data2.size());
		
		
		
		
		
	}
}