package genricMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessCromeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
			ChromeOptions option= new ChromeOptions();
			option.addArguments("window-size=1400,800");
			option.addArguments("headless");  
			
			WebDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
		//	driver.get("http://demo.guru99.com/test/ajax.html");
		//	System.out.println("guru");
				
			driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

			driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
  
			List<WebElement> list =	driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//a"));
			 
			for(int i=0;i<list.size();i++)
			{ 
				//System.out.println(list.get(i).getText());
				if(list.get(i).getText().contains("Another action"))
				{
					System.out.println(list.get(i).getText());
				//	Thread.sleep(2000);
					list.get(i).click();
					break;
				}
			}
	}

}
