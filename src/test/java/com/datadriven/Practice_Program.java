package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice_Program {
	
	
	
	public void exel_sheet() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		
		FileInputStream fil = new FileInputStream(f);
		
		
		//workbook
		 XSSFWorkbook w = new XSSFWorkbook(fil);
		 
		 XSSFSheet sheetAt = w.getSheetAt(0);
		 
		 int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		 
		 for (int i = 0; i < numberOfRows; i++) {
			 
			 XSSFRow row = sheetAt.getRow(i);
			 
			 int numberOfCells = row.getPhysicalNumberOfCells();
			
			 for (int k = 0; k < numberOfCells; k++) {
				 
				  XSSFCell cell = row.getCell(k);
				  
				  CellType cellType = cell.getCellType();
				  
				  if (cellType.equals(cellType.STRING)) {
					  
					  String cellValue = cell.getStringCellValue();
					  System.out.println(cellValue);
					
				}
				  else if (cellType.equals(cellType.NUMERIC)) {
					  
					  double cellValue = cell.getNumericCellValue();
					  int no = (int) cellValue;
					  System.out.println(no);
					
				}
				  
				  
				  
				  
				  
				  
				  
				  
				
			}
		}
		 
		 
	}

}
