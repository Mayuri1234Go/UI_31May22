package genricMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementVisibility {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/CromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		//1.isDisplayed() method for all the elements
		boolean b1=driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);//true

		//2.isEnabled() method
		boolean b2 =driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//true

		//3.isSelected() method only applicable for checkbox, dropdown, rediobuttton

		boolean b3=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b3);//true

		//de-Select the checkbox

		boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);//false
	}

}
