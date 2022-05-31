package genricMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();

		List<WebElement> list =	driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
		
		for(int i=0;i<list.size();i++)
		{
			//System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Another action"))
			{
				System.out.println(list.get(i).getText());
				Thread.sleep(2000);
				list.get(i).click();
				break;
			}
		}

	}

}
