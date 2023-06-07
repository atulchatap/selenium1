package POM_with_pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB4Homepage {

	@FindBy(xpath="//div[text()='My Account']") private WebElement MyAcc;
	WebDriver driver1;

	public PB4Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void ClickOnMyAccDropDown() 
	{
		Actions a1 = new Actions(driver1);
		a1.moveToElement(MyAcc).perform();
		
	}
	
	
	
	
	
}
