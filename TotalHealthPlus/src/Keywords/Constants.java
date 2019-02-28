package Keywords;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Constants {
	
	public static String locateFilePath = "F:\\Java Basic\\TotalHealthPlus\\src\\ObjectRepository\\Locate.properties";
	public static String environmentFilePath = "F:\\Java Basic\\TotalHealthPlus\\src\\DataEngine\\Environment.properties";
	public static String excelFilePath = "F:\\Java Basic\\TotalHealthPlus\\src\\DataEngine\\DataEngineTHP.xlsx";
	public static String testCaseDataFilePath = "F:\\Java Basic\\TotalHealthPlus\\src\\DataEngine\\TestCaseData.properties";
	
	public static String testDataFilePath = "F:\\Java Basic\\TotalHealthPlus\\src\\DataEngine\\TestData.xlsx";
	public static String sheetName = "TestData1";
	public static String excelTableData ;
	
 	public static WebDriver driver;
	public static WebElement element ;
	public static WebElement element_selected ;
	
	public static FileInputStream in ;
	public static FileInputStream fis ;
	public static FileOutputStream fos ;
	
	public static AShot as ;
	public static Date date;
	public static SimpleDateFormat formatter;
	public static String DateFormat ;
	public static Screenshot ScrShot ;

	public static Dimension d;
	
	public static Select selection;
	
	public static String actualTitle;
	public static String expectedTitle = "Company Name";
	
	public static XSSFSheet ExWSheet;
	public static XSSFWorkbook ExlWbook;
	public static XSSFCell Cell;
	
	 
	public static XSSFWorkbook wb ;
	public static XSSFSheet sheet ;
	public static Row row ;

	 
	
	
}
