package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilityclass3 {

	public static String getdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return value;
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\software testing\\automation testing\\screenshot\\TestcaseID"+TCID+".jpg");
		
		FileHandler.copy(src, dest);
		
	}
	
	public static String getpfdata(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Z SELENIUM\\propertyfile3.properties");
		Properties p1 = new Properties();
		p1.load(file);
		String value = p1.getProperty(key);
		
		return value;
		
	}
	
	
	
}
