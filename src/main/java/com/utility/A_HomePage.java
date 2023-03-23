package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_HomePage {

	public static WebDriver driver;
	
	public A_HomePage(WebDriver localdriver) {
		
		this.driver= localdriver;  
		PageFactory.initElements(localdriver, this);
	}
	
	
	


	@FindBy(xpath="//button[normalize-space()='Candy & Bakeware']")
	private WebElement candy; 
	
	@FindBy(xpath="//a[text()='Chocolate Candy']")
	private WebElement chocolateCandy;

	public WebElement getCandy() {
		return candy;
	}
	public WebElement getChocolateCandy() {
		return chocolateCandy;
	}	
	
	
}
