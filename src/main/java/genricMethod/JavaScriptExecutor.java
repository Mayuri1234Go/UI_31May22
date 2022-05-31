package genricMethod;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor {	
	WebDriver driver;
	protected WebDriverWait wait;

	public JavaScriptExecutor(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 500);
	}  
	
	
	public static void main(String[] args) {

	}
	
	public void scrollIntoViewJavascript(WebElement element) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
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
