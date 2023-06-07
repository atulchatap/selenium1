package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB4MobNumpage{
	
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]") private WebElement MobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement LoginWithPwd;
	
	public PB4MobNumpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterMobNum() 
	{
		MobNum.sendKeys("9752699306");
	}
	
	public void ClickOnLoginWithPwd() 
	{
		LoginWithPwd.click();
	}
	
	
	

}
