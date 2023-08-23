package com;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
//		File f = new File ("C://Users//Amol//Desktop//ExcelData.xlsx");		
		FileInputStream fs = new FileInputStream("D:\\study material\\Excel_Data.xlsx"); 
		
			System.out.println("Read Excel");		
			XSSFWorkbook wb = new XSSFWorkbook(fs);
			XSSFSheet sheet1 = wb.getSheetAt(0);		
			
//			String data0 =sheet1.getRow(0).getCell(0).getStringCellValue();
//			System.out.println("Data from Excel: "+data0);
//			String data1 =sheet1.getRow(0).getCell(1).getStringCellValue();
//			System.out.println("Data from Excel: "+data1);
	//	
//			String data2 =sheet1.getRow(1).getCell(0).getStringCellValue();
//			System.out.println("Data from Excel: "+data2);
//			String data3 =sheet1.getRow(1).getCell(1).getStringCellValue();
//			System.out.println("Data from Excel: "+data3);
			
			int j = sheet1.getLastRowNum();
			for(int i = 0; i<=j; i++)
			{
			String value = sheet1.getRow(i).getCell(0).getStringCellValue();
			String value1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.print(value+"\t\t");
			System.out.println(value1+"\t\t");
			}		
			System.out.println("   ");  
			wb.close();	
		}
		
	}


