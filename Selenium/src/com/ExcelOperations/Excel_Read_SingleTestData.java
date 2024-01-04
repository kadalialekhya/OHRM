package com.ExcelOperations;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	
	FileInputStream testDataFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Excel Datafile\\single_test_data.xlsx");

	//Identify the workbook in the File(Excel File)
	XSSFWorkbook WorkBook=new XSSFWorkbook(testDataFile);

	
	
	XSSFSheet TestDataSheet=WorkBook.getSheet("TestData");
	
	XSSFRow TestDatasheetRow=TestDataSheet.getRow(0);
	
	XSSFCell TestDataRowofcell=TestDatasheetRow.getCell(0);
	
	String TestData=TestDataRowofcell.getStringCellValue();
	
	
	
	

}
