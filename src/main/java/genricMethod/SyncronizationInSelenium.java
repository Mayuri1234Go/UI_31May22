package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronizationInSelenium {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	// 	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		//implicitly wait -- is always applied globally --is availble for all the elements


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");


		String title=driver.getTitle();
		System.out.println("title before login "+title);

		WebElement username	=driver.findElement(By.id("txtUsername"));

	    WebElement pass	=driver.findElement(By.id("txtPassword"));

	    WebElement loginbtn=driver.findElement(By.id("btnLogin"));
	    
	    sendKeys(driver, username, 10, "Admin");
	    sendKeys(driver, pass, 5, "admin123");
	    clickOn(driver, loginbtn, 10);

		System.out.println("Click login btn");
		
	}
	
	
	//explicit Wait
	//dynamic in nature
	//specific to element
	public static void sendKeys(WebDriver driver,WebElement element,int timeout, String value) {
		
		/*
		 * new WebDriverWait(driver, timeout).
		 * until(ExpectedConditions.visibilityOf(element));
		 */
		element.sendKeys(value);
		System.out.println("enter Text field :"+value);


	}
	
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		/*
		 * new WebDriverWait(driver, timeout).
		 * until(ExpectedConditions.visibilityOf(element));
		 */
		element.click();
	}

}
