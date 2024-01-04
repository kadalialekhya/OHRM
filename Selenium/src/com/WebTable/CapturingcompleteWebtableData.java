package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingcompleteWebtableData extends BaseTest {
	
	public void  CapturingCompleteWebtableData()
	{
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		String xpathexpressionpart1="html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathexpressionpart2="]/td[";
		String xpathexpressionpart3="]";
		
		for(int rowofindex=1;rowofindex<=36;rowofindex++)
		{
			for(int rowofcellindex=1;rowofcellindex<=36;rowofcellindex++)
			{
		
	
		By Tabledataproperty=By.xpath(xpathexpressionpart1+rowofindex+xpathexpressionpart2+rowofcellindex+xpathexpressionpart3);
		WebElement TableData=driver.findElement(Tabledataproperty);
		String TableDataText=TableData.getText();
		System.out.print(TableDataText+"|");
		
			}
			
			System.out.println();
	}
	}


		public static void main(String[]args)
		{
			CapturingcompleteWebtableData getTableData	=new CapturingcompleteWebtableData() ;
			getTableData.CapturingCompleteWebtableData();
			
		}
		
}


