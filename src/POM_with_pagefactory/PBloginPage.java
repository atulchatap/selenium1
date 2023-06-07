package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginPage {
	
	//step1
	@FindBy (xpath="//a[text()='Sign in']")private WebElement Signin;

	//step2
	public PBloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3
	public void ClickPBloginPageSignin() 
	{
		Signin.click();
		
	}
	
	
	
	
	
}
