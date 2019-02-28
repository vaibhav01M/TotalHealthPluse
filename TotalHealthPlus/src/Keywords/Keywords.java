package Keywords;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//import com.sun.xml.bind.v2.runtime.reflect.opt.Const;

import Utility.ExcelUtils;
import Utility.ReadProperty;
import net.sourceforge.htmlunit.corejs.javascript.ast.ContinueStatement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Keywords {

	public static void openBrowser(String value) {

		String Browser = ReadProperty.readProperty(Constants.environmentFilePath, value);

		switch (Browser) {
		case "Chrome":
			//System.out.println("Opening " + Browser + " Browser ");
			System.setProperty("webdriver.chrome.driver", "F:\\Java Basic\\TotalHealthPlus\\lib\\chromedriver.exe");
			Constants.driver = new ChromeDriver();
			Constants.driver.manage().window().maximize();
			System.out.println(Browser + " Browser launched successfully");
			break;
		case "Firefox":
			//System.out.println("Opening " + Browser + " Browser ");
			System.setProperty("webdriver.gecko.driver", "F:\\Java Basic\\TotalHealthPlus\\lib\\geckodriver.exe");
			Constants.driver = new FirefoxDriver();
			Constants.driver.manage().window().maximize();
			System.out.println(Browser + " Browser launched successfully");
		case "IE":

			break;
		case "Safari":

			break;
		default:
			System.out.println("Invalid Browser : " + Browser + ", Enter valid browser name");
			break;
		}
	}

	public static void enterUrl(String Url) {
		//System.out.println("Entering URL . . .");
		String URL = ReadProperty.readProperty(Constants.environmentFilePath, Url);

		Constants.driver.get(URL);
		System.out.println("URL entered ");
	}

	public static void selectFromDropDown(String key, String choice) {
		 
		String value = ReadProperty.readProperty(Constants.locateFilePath, key);
		String[] splited = value.split("##");
		Constants.element = getWebElement(splited[0], splited[1]);
		Constants.selection = new Select(Constants.element);
		Constants.selection.selectByVisibleText(choice);
		 
	}

	public static void datePicker() {
		/*
		 * import java.util.List;
		 * 
		 * import java.util.concurrent.TimeUnit;
		 * 
		 * import org.openqa.selenium.By;
		 * 
		 * import org.openqa.selenium.Keys;
		 * 
		 * import org.openqa.selenium.WebDriver;
		 * 
		 * import org.openqa.selenium.WebElement;
		 * 
		 * import org.openqa.selenium.chrome.ChromeDriver;
		 * 
		 * import org.testng.annotations.Test;
		 * 
		 * public class DateTimePicker {
		 * 
		 * @Test
		 * 
		 * public void dateTimePicker(){
		 * 
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * driver.get("http://demo.guru99.com/test/");
		 * 
		 * //Find the date time picker control
		 * 
		 * WebElement dateBox =
		 * driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		 * 
		 * //Fill date as mm/dd/yyyy as 09/25/2013
		 * 
		 * dateBox.sendKeys("09252013");
		 * 
		 * //Press tab to shift focus to time field
		 * 
		 * dateBox.sendKeys(Keys.TAB);
		 * 
		 * //Fill time as 02:45 PM
		 * 
		 * dateBox.sendKeys("0245PM");
		 * 
		 * }
		 * 
		 * }
		 */

	}

	public static WebElement getWebElement(String locatorType, String location) {
 
		switch (locatorType) {
		case "xpath":
			Constants.element = Constants.driver.findElement(By.xpath(location));
			break;
		case "cssSelector":
			Constants.element = Constants.driver.findElement(By.cssSelector(location));
			break;
		case "id":
			Constants.element = Constants.driver.findElement(By.id(location));
			break;
		case "linkText":
			Constants.element = Constants.driver.findElement(By.linkText(location));
			break;
		case "name":
			Constants.element = Constants.driver.findElement(By.name(location));
			break;
		case "partialLinkText":
			Constants.element = Constants.driver.findElement(By.partialLinkText(location));
			break;
		case "tagName":
			Constants.element = Constants.driver.findElement(By.tagName(location));
			break;
		case "className":
			Constants.element = Constants.driver.findElement(By.className(location));
			break;
		default:
			System.out.println("Invalid Locator Type : " + locatorType + " Enter Valid Locator Type");
			break;
		}

		return Constants.element;

	}

	public static void enterText(String key, String text ) {
	 
		String value = ReadProperty.readProperty(Constants.locateFilePath, key);
		System.out.println("xpath+location = ="+value);
		String value1 = ReadProperty.readProperty(Constants.testCaseDataFilePath, text);
		System.out.println("text to enter ==> "+ value1);
	 	String[] splited = value.split("##");
	 	getWebElement(splited[0], splited[1]).sendKeys(value1);
	 
	}
	
    public static void enterTextFromExcel(String key, String text ){
	
		String value = ReadProperty.readProperty(Constants.locateFilePath, key); 
	    String splited[] = value.split("##");
	    getWebElement(splited[0], splited[1]).sendKeys(text);
	}

	public static void clickButton(String key) {
		 
		String value = ReadProperty.readProperty(Constants.locateFilePath, key);
		String[] splited = value.split("##");
		//getWebElement(splited[0], splited[1]).clear();
		getWebElement(splited[0], splited[1]).click();
		System.out.println("clicked button : " + key);

	}

	public static void sleep() {
		Constants.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void takeScreenShot() {

		//System.out.println("Taking ScreenShot . . .");

		Constants.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Constants.as = new AShot();// creating an instance of Ashot as to take
									// Screen Shot
		Constants.date = new Date();// Creating an instance of date d , format is -> Mon Sep 03 13:06:56 IST 2018
	 
		// System.out.println("Day, Date & Time -> "+ d); // printing to check format - Mon Sep 03 13:06:56 IST 2018
									                      // Mon Sep 03 13:06:56 IST 2018 <- this format contains ":" & it is not allowed  in file name
									                      // as we need file name with date+time, so we have to define new format

		Constants.formatter = new SimpleDateFormat(" - E, dd MMM yyyy, HH_mm_ss");// SimpleDateFormat allows you to start by choosing any user 
		                                                                          // defined pattern for date-time formatting
																					 
		Constants.DateFormat = Constants.formatter.format(Constants.date);// Passing the Date d instance as argument to formatter to madify as per user demand
																			 
		Constants.ScrShot = Constants.as.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(Constants.driver);// taking ScreenShot

		try {
			ImageIO.write(Constants.ScrShot.getImage(), "png",
					new File("F:\\Java Basic\\TotalHealthPlus\\Screenshots\\" + Constants.DateFormat + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void windowResize(int hor, int ver) {

		Constants.d = new Dimension(hor, ver);
		Constants.driver.manage().window().setSize(Constants.d);// Resize
																// current
																// window to the
																// set dimension
	}

	public static void closeBrowser() {
		//System.out.println("Closing Browser");
		Constants.driver.close();
		System.out.println("Closed Browser");
	}
	
	public static void adminLogin() {
		 selectFromDropDown("account_type", "admin");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}

	public static void doctorLogin() {
		 selectFromDropDown("account_type", "doctor");
         enterText("email", "Dr_email");         
         enterText("password", "Dr_password");         
         clickButton("Login");      
         sleep();
	}

	public static void patientLogin() {
		 selectFromDropDown("account_type", "patient");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}

	public static void nurseLogin() {
		 selectFromDropDown("account_type", "nurse");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}

	public static void pharmacistLogin() {
		 selectFromDropDown("account_type", "pharmacist");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}

	public static void laboratoristeoLogin() {
		 selectFromDropDown("account_type", "laboratorist,eo");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}

	public static void accountantLogin() {
		 selectFromDropDown("account_type", "accountant");
         enterText("email", "emailtxt");         
         enterText("password", "passwordtxt");         
         clickButton("Login");      
         sleep();
	}
	
	public static void accountLogOut(){
		 clickButton("account");
		 clickButton("logout");
		 System.out.println("Account logged Out");
	}

    public static void browserLoad_EnterUrl_SelectLangEng(){
	openBrowser("Browser");
	enterUrl("Url");
}

    public static String getPageTitle(){
    	
    	Keywords.sleep( );
        Constants.actualTitle = Constants.driver.getTitle();
        System.out.println("Title of page => " +Constants.actualTitle);
       	return Constants.actualTitle;
        
    }
    
    public static String iteratingExcelFileTable(String excelFilePath, String sheetName, int colNum, int rowNum) throws IOException{
		
		Constants.excelTableData = ExcelUtils.readExcelFileCellData(excelFilePath, sheetName, colNum, rowNum);
		return Constants.excelTableData; 	
     }

    
}
