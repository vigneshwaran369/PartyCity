package com.runnerfile;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.Base_Class;
import com.web.properties.Configuration_Helper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\featurefile",
		glue="com.stepdefinition",monochrome = true
		,plugin = {"pretty",
		"html:target/Particity-CucumberReport/report1.html",
		"json:target/Particity-CucumberReport/report2.json",
		"junit:target/Particity-CucumberReport/report3.xml"})

public class Partycity_Runner extends Base_Class {

	
	@BeforeClass
	public static void browserLaunch() throws IOException {
		
		String browser = Configuration_Helper.getTheDetails().getBrowser();
		openBrowser(browser);
		
	}
	
	public static void closeBrowse() {
		
		over("quit");
		
	}
	
	
}
