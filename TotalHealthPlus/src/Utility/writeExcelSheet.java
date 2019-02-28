package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.bcel.classfile.Constant;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Keywords.Constants;

public class writeExcelSheet {

public static void setCellData(String sheetName, String cellText, int rowNum,int colNum ){
		
		
		File xlsx = new File(Constants.testDataFilePath);
		
		
		    try {
		    	
		    	Constants.fos = new FileOutputStream(xlsx);
		    	Constants.wb = new XSSFWorkbook();
			
		    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		   int  sheetNum = Constants.wb.getNumberOfSheets();
		    
		    for (int i = 0; i <  sheetNum ; sheetNum++) {
				
		      if (!sheetName.equalsIgnoreCase(Constants.wb.getSheetName(sheetNum)))
		    		  
		    	Constants.sheet=Constants.wb.createSheet(sheetName);
		    }
		  
		    Constants.row = Constants.sheet.createRow(rowNum);
		    Cell cell = Constants.row.createCell(colNum);
		    cell.setCellValue(cellText);
		   
		    try {
		    	Constants.wb.write(Constants.fos);
				Constants.fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		    
			
		    
		
		
		
		
		
		
		
		 
		 
}

	
}
