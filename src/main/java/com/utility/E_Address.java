package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_Address {

	
	public static WebDriver driver;
	
	public E_Address(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement fName;
	
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lName;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	private WebElement address;
	
	@FindBy(xpath = "//li[normalize-space()='Sarahs Path, Amagansett, NY']")
	private WebElement city;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement yes;
	
	@FindBy(xpath="//span[text()='Go To Payment']")
	private WebElement payment;
	
	@FindBy(xpath = "(//select[@aria-required='true'])[1]")
	private WebElement state;
	
	
	

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getAddress() {
		return address;
	}

	

	public WebElement getCity() {
		return city;
	}

	
	public WebElement getYes() {
		return yes;
	}


	public WebElement getPayment() {
		return payment;
	}


	public WebElement getState() {
		return state;
	}
	
}
