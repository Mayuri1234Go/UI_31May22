package genricMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser_Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions chromeOptions =new ChromeOptions();
		WebDriverManager.chromedriver().driverVersion("102.0.5005.63").setup();
		WebDriver driver =new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com/");
		
		}

}
