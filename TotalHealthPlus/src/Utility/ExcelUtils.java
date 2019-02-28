package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.sun.xml.bind.v2.runtime.reflect.opt.Const;


public class ExcelUtils {
 
	public static String readExcelFileCellData(String path, String SheetName,int rowNum, int colNum) throws IOException {   //This method is to set the File path and to open the Excel file
		String cellData = null;														  //Pass Excel Path and SheetName as Arguments to this method
	
			    File f = new File(path); // creating object of a File Class (creating file on mentioned path)
			    XSSFWorkbook ExWb;
			
				FileInputStream fis = new FileInputStream(f); // creating object of a FileInputStream Class
				ExWb = new XSSFWorkbook(fis);
				XSSFSheet ExWSheet =ExWb.getSheet(SheetName); // this will load specified sheet
				cellData = 	ExWSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
			 
		  // this will load workbook
			
		 
		
		//cellData = ExWSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	 		return cellData;
	}	
	 
}
