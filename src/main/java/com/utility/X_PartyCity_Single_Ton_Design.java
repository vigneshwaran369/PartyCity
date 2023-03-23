package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class X_PartyCity_Single_Ton_Design {

	public static WebDriver driver;

	public X_PartyCity_Single_Ton_Design(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public A_HomePage getA() {
		a = new A_HomePage(driver);
		return a;
	}

	public B_Add_To_The_Cart getB() {
		b = new B_Add_To_The_Cart(driver);
		return b;
	}

	public C_Detect_The_Location getC() {
		c = new C_Detect_The_Location(driver);
		return c;
	}

	public D_Create_The_Account getD() {
		d = new D_Create_The_Account(driver);
		return d;
	}

	public E_Address getE() {
		e = new E_Address(driver);
		return e;
	}

	public F_Payment getF() {
		f = new F_Payment(driver);
		return f;
	}

	private A_HomePage a;
	private B_Add_To_The_Cart b;
	private C_Detect_The_Location c;
	private D_Create_The_Account d;
	private E_Address e;
	private F_Payment f;

}
