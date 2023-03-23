package com.web.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {

		File s = new File("D:\\Forpractice\\Partycity\\src\\test\\resource\\Data\\data.properties");

		FileInputStream fi = new FileInputStream(s);

		p = new Properties();
		p.load(fi);
	}

	public String getBrowser() {

		String browser = p.getProperty("browser");
		return browser;

	}

	public String getUrl() {

		String url = p.getProperty("url");

		return url;

	}

	public String getEmail() {
		String email = p.getProperty("email");
		return email;

	}

	public String firstName() {

		String firstName = p.getProperty("firstName");
		return firstName;

	}

	public String lastName() {

		String lastName = p.getProperty("lastName");
		return lastName;

	}

	public String password() {

		String password = p.getProperty("password");
		return password;

	}
	
	public String fname() {
		String fname=p.getProperty("fname");
		return fname;
	}

	public String lname() {
		String lname=p.getProperty("lname");
		return lname;
	}
	
	public String address() {

		String address = p.getProperty("address");
		return address;
	}

	public String state() {
		String state = p.getProperty("state");
		return state;
	}
	
	

	public String cardNum() {
		String cardNumber = p.getProperty("cardNum");
		return cardNumber;
	}

	public String expDate() {

		String exp = p.getProperty("expDate");
		return exp;
	}

	public String cvv() {

		String cvv = p.getProperty("cvv");
		return cvv;
	}

	public String mobileNum() {

		String mobileNum = p.getProperty("mobileNum");
		return mobileNum;
	}

}
