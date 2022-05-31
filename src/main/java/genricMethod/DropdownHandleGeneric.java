package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandleGeneric {

	static WebDriver driver;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		By currency=By.xpath("//div//select[@id='ctl00_mainContent_DropDownListCurrency']");
		// use different select dropdown in this method multiple call 
		//	doSelectByVisibleText(currency, "USD");
		//	selectDropdownValue(currency, "index", "2");
		//	selectDropdownValue(currency, "value", "AED"); 
		//	selectDropdownValue(currency, "visibletext", "USD");

		//using enum DropDown

		selectDropdownValue(currency, DropDown.VISIBLETEXT.toString(), "USD");

	}




	public static void selectDropdownValue(By locator,String type,String value)
	{
		Select select=new Select(getElement(locator));

		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			System.out.println(select.getFirstSelectedOption().getText());
			break;

		case "value":
			select.selectByValue(value);
			System.out.println(select.getFirstSelectedOption().getText());
			break;

		case "visibletext":
			select.selectByVisibleText(value);
			System.out.println(select.getFirstSelectedOption().getText());

			break;

		default:
			System.out.println("plese pass the correct selection critria....");
			break;
		}
	}



	///////
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doSelectByVisibleText(By locator, String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
		System.out.println(select.getFirstSelectedOption().getText());
	}
}
