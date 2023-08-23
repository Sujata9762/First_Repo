package Helper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ActionsHelper {
	public void snapshot(WebDriver driver, String name) throws IOException
	{
//		Date currentdate = new Date();
//		String screenshotfileName = currentdate.toString().replace(" ", "-").replace(":", "-");	
//	    System.out.println(currentdate);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
     	FileUtils.copyFile(src, new File("C://Users//Amol//Desktop//SS//"+ name +".png"));	
		
//		FileUtils.copyFile(src, new File(".//screenshot//"+ screenshotfileName +".png"));		
	}
}


