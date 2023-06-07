package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {

	@FindBy(xpath="//input[@name='password']")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']") private WebElement signin;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPBPwdPagePwd(String Enterpwd) 
	{
		pwd.sendKeys(Enterpwd);
	}
	public void ClickPBPwdPageSignin() 
	{
		signin.click();
	}
	
	
	
	
	
	
	
}
