package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		//Identifying the file(Excel File) in the system
		FileInputStream	testDataFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\ApachePOI\\src\\com\\DataFile\\DataFile.xlsx");
		
		//Identifying the WorkBook in the file(excel file)
		XSSFWorkbook WorkBook	=new XSSFWorkbook(testDataFile);
		
		//Identify the Particular sheet in the WorkBook
		XSSFSheet sheet=WorkBook.getSheet("sheet1");
		
		//Identify the particular ROW  in the sheet
		XSSFRow SheetRow=sheet.getRow(0);
		
		//Identify the particular ROW of a cell
		XSSFCell SheetRowofcell=SheetRow.getCell(0);
		
		//Get testdata from the ROW of the cell
		String testData=SheetRowofcell.getStringCellValue();
		
		System.out.println(testData);
		
		

	}

}
