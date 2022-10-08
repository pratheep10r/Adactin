package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Column_Output {
	
	
	public void allrows() throws IOException {
		
	
		//file loactions
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		//read all datas
		FileInputStream fil = new FileInputStream(f);
		
		//Workflows Workbook XSSF
		Workbook w = new XSSFWorkbook(fil);
		
		   Sheet sheet = w.getSheet("Sheet1");   // sheet
                int numberOfRows = sheet.getPhysicalNumberOfRows();
                
                for (int i = 0; i < numberOfRows; i++) {   
                	
                	Row row = sheet.getRow(i);
						
		   String cellValue = sheet.getRow(i).getCell(0).getStringCellValue();
		  
	    	System.out.println(cellValue);
	 
	    
	}
	}
	public static void main(String[] args) throws IOException  {
		
		Column_Output c = new Column_Output();
		c.allrows();
	}
	
}
