package genricMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class ScreenshotHandle {
	
	WebDriver driver;

	@Test
	public void loginpage() throws IOException, InterruptedException{



		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click login btn");
		tackSreenShotHandle("orangehrmlivePage");
		Thread.sleep(2000);
		


	}
	
	public void tackSreenShotHandle(String fileName) throws IOException
	{
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D://UI/UIYesbank/src/main/java/genricMethod"+fileName+".jpg"));

	}


}
