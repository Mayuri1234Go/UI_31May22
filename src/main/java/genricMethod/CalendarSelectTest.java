package genricMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
	//	driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.path2usa.com/travel-companions/");
		
		// august 21
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//driver.findElement(By.cssSelector("[class='datepicker-day'][class='datepicker-switch']")).getText().contains("June");
		/*while(!driver.findElement(By.cssSelector("[class='datepicker-days'][class='datepicker-switch']")).getText().contains("June"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
		}*/
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
			
		}
		
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		
		
		int count=driver.findElements(By.className("day")).size();
		
		for (int i = 0; i <count; i++) 
		{
			
		   String text=	driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("29"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		/*driver.get("https://www.freecrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("email")).sendKeys("vinayak.waghchaure@aqmtechnologies.com");
		driver.findElement(By.name("password")).sendKeys("Pass@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[1]"));
*/	}

}
