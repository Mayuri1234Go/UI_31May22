package com.yesbank.qa.testscases;

import org.testng.TestNG;

import com.yesbank.qa.ExtentReportListener.ExtentReporterNG;
import com.yesbank.qa.testscases.LoginPageTest;
public class TestRunner {
	
	static TestNG testNg;
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ExtentReporterNG ext=new ExtentReporterNG();
		
		testNg =new TestNG();
		
		testNg.setTestClasses(new Class[] {LoginPageTest.class});
		testNg.addListener(ext);
		testNg.run();

	}

}
