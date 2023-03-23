package com.normalCodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.BaseClass.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Party_City extends Base_Class{

	public static void main(String[] args) {

		openBrowser("google");
		getURL("https://www.partycity.com/");
		
//		openBrowser("fire fox");
//		getURL("https://www.partycity.com/");
		
	}

}
