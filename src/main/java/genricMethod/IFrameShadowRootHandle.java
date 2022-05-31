package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameShadowRootHandle
{
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://selectorshub.com/xpath-practice-page/");

		driver.switchTo().frame("pact");
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		WebElement element=	(WebElement) jse.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		String js="arguments[0].setAttribute('value','Green Masala Tea')";
		jse.executeScript(js, element);
		


	}

}
