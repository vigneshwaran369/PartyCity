package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_Detect_The_Location {

	
	public static WebDriver driver;
	
	public C_Detect_The_Location(WebDriver localdriver) {
		
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	
	
	
	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getUseMyLocation() {
		return useMyLocation;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}



	@FindBy(xpath="//button[normalize-space()='Change ZIP Code']")
	private WebElement zipCode;
	
	@FindBy(xpath="/html/body/pc-modal-portal/dialog/div[2]/pc-change-zipcode/div/div/pc-use-my-location/button")
	private WebElement useMyLocation;
	
	@FindBy(xpath = "//button[@value='Continue to Checkout']")
	private WebElement checkOut;
	
	
	
	
}
