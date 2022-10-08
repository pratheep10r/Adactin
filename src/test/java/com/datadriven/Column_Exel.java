
package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Column_Exel {
	
	public static void column_datas() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		
		System.out.println("****Get--> 1St Column(0)  ****");
		System.out.println("     ");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet sheetAt = w.getSheetAt(3);
		      
		     int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		     
		     for (int i = 0; i < physicalNumberOfRows; i++) {
		    	 
		    	 Row row = sheetAt.getRow(i);      // row
		    	   
		    	 Cell cell = row.getCell(0);       // column
		    	  System.out.println(cell);
		    	  
			}
		
	}
	public static void main(String[] args) throws IOException {
		column_datas();
		
	}

}
