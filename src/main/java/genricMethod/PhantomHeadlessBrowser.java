package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomHeadlessBrowser {

	WebDriver driver;

	@Test
	public void modelpopup(){

		System.setProperty("phantomjs.binary.path", "D://phantomjs-2.1.1-windows/bin/phantomjs.exe");
		driver = new PhantomJSDriver(); //launch browser 


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");


		String title=driver.getTitle();
		System.out.println("title before login "+title);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click login btn");
		
		System.out.println("title after login "+title);


	}

}
