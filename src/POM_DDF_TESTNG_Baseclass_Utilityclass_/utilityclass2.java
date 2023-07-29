package POM_DDF_TESTNG_Baseclass_Utilityclass_;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityclass2 {

	
	public static String getdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\\\software testing\\\\apache foi\\\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return value;
	}
	
	
	
	
}
