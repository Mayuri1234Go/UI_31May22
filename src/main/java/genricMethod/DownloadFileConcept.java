package genricMethod;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.hamcrest.CoreMatchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;

public class DownloadFileConcept {

	WebDriver driver;
	File folder;

	@BeforeMethod
	public void setUp()
	{
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();

		//chorme:
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");

		ChromeOptions options=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String, Object>();

		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());

		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cop= DesiredCapabilities.chrome();
		cop.setCapability(ChromeOptions.CAPABILITY, options);

		driver=new ChromeDriver(cop);


		//driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void downloadfileTest() throws InterruptedException
	{
		driver.get("https://the-internet.herokuapp.com/download");

		//driver.findElement(By.xpath("//div[@id='content']//a[contains(text(),'shubham.png')]")).click();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();

		Thread.sleep(2000);
		File listofFiles[]= folder.listFiles();
		//Assert.assertEquals(listofFiles.length, is(not(0)));

		Assert.assertTrue(listofFiles.length>0);

		for (File file:listofFiles) {
			//	Assert.assertEquals(file.length(), is(not((long)0)));
			Assert.assertTrue(file.length()>0);

		}
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		for (File file:folder.listFiles()) {
			file.delete();
			folder.delete(); 
		}
	}



}
