package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CrmTest {

	@Test
	public static void getdata () {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.get("https://opensource-demo.orangehrmlive.com/");

		String admin= Data.getUserLoginInfo().get("admin");
		String usernameadminInfo[]= admin.split("_");

		driver.findElement(By.id("txtUsername")).sendKeys(usernameadminInfo[0]);
		System.out.println(usernameadminInfo[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(usernameadminInfo[1]);
		System.out.println(usernameadminInfo[1]);


		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click login btn");






	}

}
