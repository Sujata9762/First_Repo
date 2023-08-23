package ToolsQA.DemoMavenEclipseProject;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIExample {

	public static void main(String[] args) throws IOException {

		//File f = new File("D:\\study material\\Excel_Data.xlsx");
		FileInputStream fs = new FileInputStream("D:\\study material\\Excel_Data.xlsx");
		
		System.out.println("Read Excel sheet:");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int j = sheet.getLastRowNum();
		for(int i=0; i<=j; i++)
		{
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			String value1 = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value+ "\t");
			System.out.print(value1+ "\t");
		}
		
		System.out.println(" ");
		workbook.close();
		
	}

}
