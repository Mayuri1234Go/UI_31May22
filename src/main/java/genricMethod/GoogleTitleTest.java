package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


public class GoogleTitleTest {

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
		driver.get("https://www.google.com/");
	}


	@Test
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123", "Title is not matched");
	}

	@Test
	public void mailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();	
	}

}
