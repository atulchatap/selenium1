package POM_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBloginTest {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("F:\\software testing\\apache foi\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBloginpage login = new PBloginpage(driver);
		login.ClickPBloginpageSignup();
		Thread.sleep(2000);
		
		PBMobNumPage mob = new PBMobNumPage(driver);
		String mobn = sh.getRow(0).getCell(0).getStringCellValue();
		mob.InpPBMobNumPageMobNum(mobn);
		mob.ClickPBMobNumPageSigninWithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd = new PBPwdPage(driver);
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.InpPBPwdPagePwd(password);
		pwd.ClickPBPwdPageSignin();
		Thread.sleep(3000);
		
		PBHomePage home = new PBHomePage(driver);
		home.OpenDDPBHomePageMyAcc();
		Thread.sleep(3000);
		
		PBMyAccPage myacc = new PBMyAccPage(driver);
		myacc.ClickPBMyAccPageMyProfile();
		Thread.sleep(4000);
		
		PBProfilePage myprofile = new PBProfilePage(driver);
		myprofile.SwitchtoPBProfilePageChildWindow();
		String exptext = sh.getRow(0).getCell(2).getStringCellValue();
		myprofile.VerifynamePBProfilePageUsername(exptext);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
