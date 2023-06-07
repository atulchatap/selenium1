package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB1Pwdpage {
	
	@FindBy(xpath="//input[@name='password']") private WebElement Pwd;
	@FindBy(xpath ="//span[text()='Sign in']")private WebElement login;
	
	public PB1Pwdpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void InpPB1PwdpagePwd(String Password) 
	{
		Pwd.sendKeys(Password);
	}
	public void ClickPB1PwdpageLogin()
	{
		login.click();
	}
	

}
