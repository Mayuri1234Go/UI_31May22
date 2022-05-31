package com.yesbank.qa.util;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/*
 * Created By Vinayak Waghchuare
 * date 25/04/2022 */
public class GenericUtilMethods {

	WebDriver driver;
	protected WebDriverWait wait;

	public GenericUtilMethods(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 500);
	}   

	public void selectDropdownByVisibleText(WebElement element, String visibleText,String fieldname) throws InterruptedException {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		Reporter.log("<B>"+ visibleText +"</B> is selected from "+ fieldname);
	}

	public void enterText(WebElement element, String text){  
		element.sendKeys(text);
		Reporter.log("<B>"+ text +"</B> is enter text from text field");
	}

	public void scrollIntoViewJavascript(WebElement element) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void getTitleofPage(){
		String title=driver.getTitle();
		System.out.println("title is "+title);
		Reporter.log("<B>"+ title +"</B>This is Title Of Page ");
	}


	public void switchToDefaultContent(){
		driver.switchTo().defaultContent();
	}

	public void highlighter(WebElement webElement)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",webElement);
	}
	

	public void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()", element);
	}

	public void refreshBroserByJs(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title; 
	}

	public void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scollTo(0,document.body.scrollHeight)");
	}
	
	
	
	

}
