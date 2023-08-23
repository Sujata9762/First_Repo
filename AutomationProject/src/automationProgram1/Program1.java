package automationProgram1;

//import ToolsQA.DemoMavenEclipseProject.ChromeDriver;
//import ToolsQA.DemoMavenEclipseProject.WebDriver;

public class Program1 {


		public static void main(String args[]) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromDriver();
			driver.get("https://www.flipkart.com/");
			
					
			
	}
}
