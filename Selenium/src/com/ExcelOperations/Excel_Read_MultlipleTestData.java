package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultlipleTestData {

	public static void main(String[] args) throws IOException {
		//Identify the File(Excel file) in the system
		FileInputStream TestDataFile=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\OrangeHRMApplication\\Selenium\\Excel Datafile\\single_test_data.xlsx");

		//Identify the WorkBook in the file
		XSSFWorkbook Workbook=new XSSFWorkbook("testDataFile");
		
		//Identify a particular sheet in the workbook
		XSSFSheet testDataFileSheet=Workbook.getSheet("TestData");
		
		//Identify the number of active rows in the sheet
		int rowcount=testDataFileSheet.getLastRowNum();
		
		//for going to every active row in the sheet
		for(int rowindex=0;rowindex<=rowcount;rowindex++)
		{
			//going to a particular row
		XSSFRow	testDataRow=testDataFileSheet.getRow(rowindex);
		
		//In the current Row -finding the no.of active cells
		int rowofcellscount=testDataRow.getLastCellNum();
		
		//to goto every active row of the active cells
		for(int rowofcell=0;rowofcell<rowofcellscount;rowofcell++)
		{
			//going to active row of an active cell
	XSSFCell testDatarowofactivecell=testDataRow.getCell(rowofcell);
	
	//getting the data from the activerow of an active cell
	String testData=testDatarowofactivecell.getStringCellValue();
	
	//print the data
	System.out.println(testData+" / ");
		}
		System.out.println();
		}
	}

}
