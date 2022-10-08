package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivan_Read_Exel {
	
	public void read_alldata() throws IOException {
		
		//--> File Loaction
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		
		//---> Read all data inputs
		FileInputStream  fil = new FileInputStream(f);              //Add throws
		
		//--> workbook-->XSSFworkbook
	  // Interface          class
		Workbook w = new XSSFWorkbook(fil);   //--->upcasting        //Add throws
		
		
		Sheet sheetAt = w.getSheetAt(0);    //---> Sheet select

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();   //--> Find num of rows in sheet
		
		
	    for (int i = 0; i < numberOfRows; i++) {                 // nestted for loop 
	    	
	    	Row row = sheetAt.getRow(i);
	    	 
	    	int numberOfCells = row.getPhysicalNumberOfCells();
			
	    	for (int j = 0; j < numberOfCells; j++) {
	    		
	    		Cell cell = row.getCell(j);
	    		
	    		CellType cellType = cell.getCellType();           //--> Two type of cell String & Numeric
	    		
	    		if (cellType.equals(cellType.STRING)) {
	    			
	    			String cellValue = cell.getStringCellValue();
	    			System.out.println(cellValue);			
				}		
	    		else if (cellType.equals(cellType.NUMERIC)) {
	    			
	    			double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue;   //---->Narrowing Type Casting
					System.out.println(num);
				}
			}
	    	
		}	
	}
	public static void main(String[] args) throws IOException  {
		
		Datadrivan_Read_Exel  data = new Datadrivan_Read_Exel();
		data.read_alldata();
		
		
	}

}
