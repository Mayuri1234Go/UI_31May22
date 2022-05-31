package singleStonePattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseSingleStone {

	public static WebDriver driver=null;
	public static String  browserName="chrome";

	public static void initialize()
	{
		//Single Stone Pattern
		if(driver==null)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("FF"))
			{
				System.setProperty("webdriver.gecko.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}


		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(Constants.url);


	}


	public static void quit() {
		System.out.println("quitting the browser");
		driver.quit();
		driver=null;
	}

	public static void close() {
		System.out.println("closing the browser");
		driver.close();
		driver=null;
	}

	public static void main(String[] args) {



	}

}
