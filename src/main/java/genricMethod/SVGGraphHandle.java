package genricMethod;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SVGGraphHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://emicalculator.net/");
		Thread.sleep(5000);

		String verticalXpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group' ]//*[name()='rect']";

		String textXpath="//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined' ]//*[name()='text']";
		List<WebElement> barlist=driver.findElements(By.xpath(verticalXpath));

		System.out.println("totals bar: "+barlist.size());
		Actions act =new Actions(driver);
		
		for (WebElement e : barlist) {

			act.moveToElement(e).perform();
			Thread.sleep(5000);
			String text=driver.findElement(By.xpath(textXpath)).getText();
			System.out.println(text);

		}


	}


}
