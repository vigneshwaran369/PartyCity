package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_Add_To_The_Cart {

	
	
	public static WebDriver driver;
	
	
	public B_Add_To_The_Cart(WebDriver localdriver) {
		
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
		
	}
	
	
	public WebElement getKitkat() {
		return kitkat;
	}

	public WebElement getShipIt() {
		return shipIt;
	}

	public WebElement getViewCart() {
		return viewCart;
	}

	@FindBy(xpath="//a[normalize-space()='Milk Chocolate Snack Size Kit Kat Bars Bag, 21pc']")
	private WebElement kitkat;

	
	@FindBy(xpath="//button[normalize-space()='Ship It']")
	private WebElement shipIt;
	
	@FindBy(xpath="//a[normalize-space()='View Cart']")
	private WebElement viewCart;
	
	
}
