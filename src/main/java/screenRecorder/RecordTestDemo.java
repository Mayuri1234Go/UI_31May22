package screenRecorder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecordTestDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	@Test
	public void NavigationTest() throws Exception
	{
		
		MyScreenRecorder.startRecording("NavigationTest");
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		MyScreenRecorder.stopRecording();
	}
	
	@Test
	public void NavigationTest2() throws Exception
	{
		
		MyScreenRecorder.startRecording("NavigationTest2");
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		MyScreenRecorder.stopRecording();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
