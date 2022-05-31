package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectByIdDropDownTest {
	
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
	public void SelectDropdwonByIdTest() throws InterruptedException
	{
		WebElement staticDropdown = driver.findElement(By.xpath("//div//select[@id='ctl00_mainContent_DropDownListCurrency']"));

		selectDropdownById(staticDropdown,3,"currency");
	}
	
	
	public static void selectDropdownById(WebElement element, int id,String fieldname) throws InterruptedException {
		Select dropDown = new Select(element);
		dropDown.selectByIndex(id);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		System.out.println(id+"is selected from" +fieldname);

	}

}
