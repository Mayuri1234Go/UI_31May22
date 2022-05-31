package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * Created By Vinayak waghchaure
 */
public class GoogleTestNG {

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


	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority=2,groups="LinkTest")
	public void mailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}

	@Test(priority=3 ,groups="Serch Text")
	public void SerchText()
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
	}

	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println(" test1 ");	
	}
	

	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println(" test2 ");	
	}

	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println(" test3 ");	
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();	
	}
}
