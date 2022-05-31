package genricMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/CromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");

		//driver.findElement(By.xpath("//ul[@role='listbox']//li"));

		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));

		System.out.println("Total no of suggestion in search Box:::"+list.size());

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("javascript")) 
			{
				list.get(i).click();
				break;
			}
		}

	}

}
