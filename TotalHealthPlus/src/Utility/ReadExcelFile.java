package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Keywords.Constants;

public class ReadExcelFile {

	public static int rowCount = 0;	
	
	public static String getCellData(String sheetName,int rowNum,int colNum){
		
		String cellData = null ;
		File xlsx = new File("F:\\Java Basic\\TotalHealthPlus\\src\\DataEngine\\TestData.xlsx");
		try {
			 Constants.fis = new FileInputStream(xlsx);
			 Constants.wb = new XSSFWorkbook(Constants.fis);
			 Constants.sheet = Constants.wb.getSheet(sheetName);
			 rowCount = Constants.sheet.getLastRowNum();
			 cellData = Constants.sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			
			Constants.wb.close();
		} catch (IOException e) {
 
			e.printStackTrace();
		}
	
		return cellData;
		
	}
}
