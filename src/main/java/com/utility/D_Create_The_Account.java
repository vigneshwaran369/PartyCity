package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_Create_The_Account {

	
	public static WebDriver driver;
	
	public D_Create_The_Account(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getClickCreateMyAcc() {
		return clickCreateMyAcc;
	}

	
	@FindBy(xpath="//a[normalize-space()='Create Your Party City Account']")
	private WebElement createAccount;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement email;
	
	


	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstName;
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastName;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//button[normalize-space()='Create My Account']")
	private WebElement clickCreateMyAcc;
	
	
	
	
	
	
	
	
	
}
