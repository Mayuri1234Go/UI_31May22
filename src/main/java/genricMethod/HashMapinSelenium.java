package genricMethod;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapinSelenium {  

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("customer"));

		String credentials=getCredentialsMap().get("Admin");

		driver.findElement(By.id("txtUsername")).sendKeys(credentials.split(":")[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(credentials.split(":")[1]);
		driver.findElement(By.id("btnLogin")).click();

		System.out.println("Click login btn");


	}


	public static HashMap<String, String> getCredentialsMap()
	{
		HashMap<String, String> username=new HashMap<String, String>();
		username.put("customer", "customer123");
		username.put("Admin", "Admin:admin123");
		username.put("Seller", "Seller123");
		username.put("Order", "Order123");

		return username;

	}
}
