package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PB1loginTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	PB1loginPage p1 = new PB1loginPage(driver);
	p1.ClickPBloginpagelogin();
	Thread.sleep(2000);
	
	PB1MobNumpage p2 = new PB1MobNumpage(driver);
	String mobnum = sh.getRow(0).getCell(0).getStringCellValue();
	p2.InpPB1MobNumpageMobnum(mobnum);
	p2.ClickPB1MobNumpageLoginPwd();
	Thread.sleep(2000);
	
	PB1Pwdpage p3 = new PB1Pwdpage(driver);
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	p3.InpPB1PwdpagePwd(pwd);
	p3.ClickPB1PwdpageSignin();
	Thread.sleep(2000);
	
	PB1Homepage p4= new PB1Homepage(driver);
	p4.MovetoelementPB1HomepageMyAcc();
	Thread.sleep(2000);
	
	PB1MyAccpage p5 = new PB1MyAccpage(driver);
	p5.ClickPB1MyAccpageMyProfile();
	Thread.sleep(2000);
	
	PB1MyProfilepage p6 = new PB1MyProfilepage(driver);
	p6.SwitchtoPB1MyProfilepageChildwindow();
	String exptext = sh.getRow(0).getCell(2).getStringCellValue();
	p6.VerifyPB1MyProfilepageUsername(exptext);
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
