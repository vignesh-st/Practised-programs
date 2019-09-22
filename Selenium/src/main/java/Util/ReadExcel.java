package Util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	public  static Object[][] readData() throws IOException{
		
		//String excelfilename = "Data_CreateLead";
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/Data_CreateLead.xlsx");
		XSSFSheet sheetAt = wb.getSheetAt(0);
		//int totalrows = sheetAt.getPhysicalNumberOfRows();
		int exceptHeadRowCount = sheetAt.getLastRowNum();
		short lastCellNum = sheetAt.getRow(3).getLastCellNum();
		
		//System.out.println(totalrows);
		//System.out.println(exceptHeadRowCount);
		//System.out.println(lastCellNum);
		String[][] datafromExcel = new String[exceptHeadRowCount][lastCellNum];
		for(int i=1;i<=exceptHeadRowCount;i++)
		{
			XSSFRow row = sheetAt.getRow(i);
			for(int j=0;j<lastCellNum;j++)
			{
				datafromExcel[i-1][j] =row.getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return datafromExcel;
		
		
	}}
	
		
