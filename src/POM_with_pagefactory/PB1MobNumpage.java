package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1MobNumpage {

	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath= "(//span[text()='Sign in with Password'])[2]") private WebElement SigninWithPwd;
	
	public PB1MobNumpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB1MobNumpageMobNum(String mobnum) 
	{
		MobNum.sendKeys(mobnum);
	}
	public void ClickPB1MobNumpageSigninPwd() 
	{
		SigninWithPwd.click();
	}
}
