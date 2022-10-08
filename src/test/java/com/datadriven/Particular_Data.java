package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Data {
	
public static void data_p() throws IOException {
	

	//file loactions
	File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
	
	System.out.println("*** Get--> Particular data-->***");
	System.out.println("  ");
	//read all datas
	FileInputStream fil = new FileInputStream(f);
	
	//Workflows Workbook XSSF
	Workbook w = new XSSFWorkbook(fil);
	
     Sheet sheetAt = w.getSheetAt(0);
     
     Row row = sheetAt.getRow(3);           // 3rd row 
     
     Cell cell = row.getCell(2);            // 2nd column
     
     CellType cellType = cell.getCellType();
     
     if (cellType.equals(cellType.STRING)) {
    	 String value = cell.getStringCellValue();
    	 System.out.println(value);
		
	}
     else if (cellType.equals(cellType.NUMERIC)) {
    	 
    	 double cellValue = cell.getNumericCellValue();
    	 int no = (int) cellValue;
    	 System.out.println(no);
		
	}
    }
        public static void main(String[] args) throws IOException {
			data_p();
        	
		}
}