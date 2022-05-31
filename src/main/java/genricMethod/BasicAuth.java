package genricMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String pageMessage= driver.findElement(By.cssSelector("p")).getText();
		System.out.println(pageMessage);
	}

}
