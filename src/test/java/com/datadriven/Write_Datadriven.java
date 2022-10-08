package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Datadriven {
	
	public static void write_exels() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\age.xlsx");
		
		FileInputStream fil = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet createSheet = w.createSheet("Greens");   // Create  Sheet
		
		 Row createRow = createSheet.createRow(0);
		 
		 Cell createCell = createRow.createCell(0);
		 
		 createCell.setCellValue("santhya");           //--->1
		 
		 w.getSheet("Greens").getRow(0).createCell(1).setCellValue("098");
		 w.getSheet("Greens").getRow(0).createCell(2).setCellValue("pass");
		                                               //--->2
		 w.getSheet("Greens").createRow(1).createCell(0).setCellValue("nisha");
		 w.getSheet("Greens").getRow(1).createCell(1).setCellValue("34");
		 w.getSheet("Greens").getRow(1).createCell(2).setCellValue("Fail");
		                                              //---> 3
		 w.getSheet("Greens").createRow(2).createCell(0).setCellValue("Revan");
		 w.getSheet("Greens").getRow(2).createCell(1).setCellValue("100");
		 w.getSheet("Greens").getRow(2).createCell(2).setCellValue("pass");
		 
		                                             //---> 4
		 w.getSheet("Greens").createRow(3).createCell(0).setCellValue("Tamizh");
		 w.getSheet("Greens").getRow(3).createCell(1).setCellValue("90");
		 w.getSheet("Greens").getRow(3).createCell(2).setCellValue("pass");
		 
		 FileOutputStream f2 = new FileOutputStream(f);
		 
		 w.write(f2);
		 w.close();	 
		
		
	}
	public static void main(String[] args) throws IOException {
		write_exels();

	}
	

}
