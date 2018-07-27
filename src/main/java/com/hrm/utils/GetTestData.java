package com.hrm.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetTestData {
	
	public static String[][] getData() throws IOException {
		
		File file = new File(".\\TestData\\EmpData.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook empBook=  new  XSSFWorkbook(input);
		Sheet empSheet=empBook.getSheet("EmpSheet");
		//System.out.println("Last Row num : "+empSheet.getLastRowNum());
		//System.out.println("First Row  num: "+empSheet.getFirstRowNum());
		int rowCount=empSheet.getLastRowNum()-empSheet.getFirstRowNum();
		System.out.println("Row count :" +rowCount);
	    Row row =empSheet.getRow(0);
	    int colCount=row.getLastCellNum();
	   // System.out.println("Col count :" +colCount);
	    String[][] empArray = new String[rowCount][colCount];
	    for(int i=1;i<rowCount;i++)
	    {
	    	Row rows=empSheet.getRow(i);
	    	for(int j=0;j<colCount;j++)
	    	{
	    		empArray[i-1][j]=rows.getCell(j).getStringCellValue();
	    		//System.out.println("Loops iterations :" +i+" col valume :"+j);
	    		//System.out.println("Vales : " +empArray[i-1][j]);
	    	}
	    }
	    return (empArray);
	}

}
