package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_Payment {

	public static WebDriver driver;
	
	public F_Payment(WebDriver localdriver) {
		this.driver=localdriver;
		PageFactory.initElements(localdriver, this);
	}
	
	public WebElement getContinu() {
		return continu;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getExDate() {
		return exDate;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getMobileNum() {
		return mobileNum;
	}

	public WebElement getReviewMyOrder() {
		return reviewMyOrder;
	}

	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continu;
	
	@FindBy(xpath="//div[text()='Credit Card']")
	private WebElement creditCard;
	
	
	@FindBy(name = "dwfrm_billing_creditCardFields_cardNumber")
	private WebElement cardNum;
	
	@FindBy(xpath ="//input[@placeholder='MM/YY']")
	private WebElement exDate;
	
	@FindBy(xpath = "//input[@placeholder='CVV']")
	private WebElement cvv;
	
	@FindBy(xpath = "//label[normalize-space()='Use Shipping Address']")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@placeholder='Phone Number']")
	private WebElement mobileNum;
	
	@FindBy(xpath="//span[text()='Review Your Order']")
	private WebElement reviewMyOrder;
	
}

