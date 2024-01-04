package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOperation {

	public static void main(String[] args) throws IOException {
		//Identifying the Excel File in the system
		FileInputStream testDataFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Excel Datafile\\single_test_data.xlsx");

		//Identify the workbook in the File(Excel File)
		XSSFWorkbook WorkBook=new XSSFWorkbook(testDataFile);
		
		//Identidy a particular sheet in the WorkBook
		XSSFSheet TestDataSheet=WorkBook.getSheet("TestData");
		
		//Create a particular ROW in the Sheet
		XSSFRow SheetofNewRowCreated=TestDataSheet.createRow(1);
		
		//Create a particular Row of a cell
		XSSFCell newRowOfCellCreated=SheetofNewRowCreated.createCell(0);
		
		//Setting the value into new RowOfCell Created
		newRowOfCellCreated.setCellValue("Functional Testing");
		
		//Saving the vfile with the path of the location of the system with a name along with the WorkBook
		FileOutputStream testResultFile=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Excel Datafile\\single_test_data.xlsx");
		WorkBook.write(testResultFile);
	}

}
