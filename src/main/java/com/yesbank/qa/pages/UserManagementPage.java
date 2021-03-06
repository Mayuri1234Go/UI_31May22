package com.yesbank.qa.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.yesbank.qa.base.TestBase;

public class UserManagementPage extends TestBase {

	@FindBy(xpath ="//input[@id='searchSystemUser_userName']")
	WebElement UsernameTxtField;

	@FindBy(xpath ="//input[@id='searchSystemUser_employeeName_empName']")
	WebElement employeeTxtField;

	@FindBy(xpath ="//input[@id='searchBtn']")
	WebElement searchBtn;

	@FindBy(xpath ="//input[@id='resetBtn']")
	WebElement ResetBtn;

	@FindBy(xpath ="//input[@id='btnAdd']")
	WebElement addBtn;

	@FindBy(xpath ="//input[@id='btnDelete']")
	WebElement  deleteBtn;
	
	@FindBy(xpath ="//input[@id='btnSave']")
	WebElement  saveBtn;

    //add user
	@FindBy(xpath ="//input[@id='systemUser_employeeName_empName']")
	WebElement  employeeNameTxtFiled;
	
	@FindBy(xpath ="//input[@id='systemUser_userName']")
	WebElement  userNameTxtFiled;
	
	@FindBy(xpath ="//input[@id='systemUser_password']")
	WebElement  passwordTxtFiled;
	
	@FindBy(xpath ="//input[@id='systemUser_confirmPassword']")
	WebElement  confirmPasswordTxtFiled;

	

	//Initialization Page objects
	public UserManagementPage(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void searchUser() {
		String uname ="Aravind";
		UsernameTxtField.sendKeys(uname);
		searchBtn.click();
	}
	
	public void addUser(String empName,String uname,String pass,String confirmPass) {
		/*String empName ="Vinay";
		String uname="Vianayk";
		String pass="Test@12345";
		String confirmPass="Test@12345";
*/
		
		addBtn.click();
		Reporter.log("Click the add btn");

		employeeNameTxtFiled.sendKeys(empName);
		Reporter.log("Enter emp Name" +empName);
		userNameTxtFiled.sendKeys(uname);
		Reporter.log("Enter username Name" +uname);
		
		passwordTxtFiled.sendKeys(pass);
		confirmPasswordTxtFiled.sendKeys(confirmPass);
		saveBtn.click();
		Reporter.log("Click the Save btn");

	}
	
	///
	
	
	public void addUserNew(Properties dataRow) {

		addBtn.click();
		Reporter.log("Click the add btn");

		employeeNameTxtFiled.sendKeys(dataRow.getProperty("empName"));
		Reporter.log("Enter emp Name :" +dataRow.getProperty("empName"));
		System.out.println("Enter emp Name :" +dataRow.getProperty("empName"));
		userNameTxtFiled.sendKeys(dataRow.getProperty("uname"));
		Reporter.log("Enter username Name :" +dataRow.getProperty("uname"));
		System.out.println("Enter username Name :" +dataRow.getProperty("uname"));
		passwordTxtFiled.sendKeys(dataRow.getProperty("pass"));
		Reporter.log("Enter password Name :" +dataRow.getProperty("pass"));
		System.out.println("Enter password Name :" +dataRow.getProperty("pass"));
		confirmPasswordTxtFiled.sendKeys(dataRow.getProperty("confirmPass"));
		Reporter.log("Enter confirmPass Name :" +dataRow.getProperty("confirmPass"));
		System.out.println("Enter confirmPass Name :" +dataRow.getProperty("confirmPass"));

		saveBtn.click();
		Reporter.log("Click the Save btn");

	}
	
	
	
}
