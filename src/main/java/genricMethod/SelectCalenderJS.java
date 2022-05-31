package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderJS {
	/*
	 * Created by vinayak
	 * dated 28-04-22
	 */

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.path2usa.com/travel-companions/");

		//input[@id='travel_date']

	//	WebElement date=driver.findElement(By.xpath("//div[contains(text(),'Departure Date')]/following::div[1]"));
		WebElement date=driver.findElement(By.xpath("//input[@id='travel_date']"));
		String dateval="05-21-2022";

		SelectDateByJS(driver, date, dateval);
	}



	public static void SelectDateByJS(WebDriver driver,WebElement element,String dateval) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	}
}
