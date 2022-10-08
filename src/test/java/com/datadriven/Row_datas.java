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

public class Row_datas {
	
	public static void Rows() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		
		System.out.println(" ***Get--> 2nd Rows(1)  ****  ");
		System.out.println("  ");
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);                   // 2nd rows
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			
		  Cell cell = row.getCell(i);
		  CellType cellType = cell.getCellType();
		
	if (cellType.equals(cellType.STRING)) {
	
		String stringCellValue = cell.getStringCellValue();
		System.out.print(stringCellValue);
		
	}
	else if (cellType.equals(cellType.NUMERIC)) {
		double cellValue = cell.getNumericCellValue();
		int no = (int) cellValue;
		System.out.print(no);
	
		
	}			
		}

}
	public static void main(String[] args) throws IOException {
		Rows();
		System.out.println("   ");
		
	}
}