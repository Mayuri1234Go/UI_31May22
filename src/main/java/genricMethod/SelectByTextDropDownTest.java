package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectByTextDropDownTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver(); //launch browser

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	@Test
	public void SelectDropdwonByTextTest() throws InterruptedException
	{
		WebElement staticDropdown = driver.findElement(By.xpath("//div//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		selectDropdownByVisibleText(staticDropdown,"USD","currency");

	}


	public void selectDropdownByVisibleText(WebElement element, String visibleText,String fieldname) throws InterruptedException {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		System.out.println(visibleText+"is selected from" +fieldname);
		Reporter.log("<B>"+ visibleText +"</B> is selected from "+ fieldname);
	}

}
