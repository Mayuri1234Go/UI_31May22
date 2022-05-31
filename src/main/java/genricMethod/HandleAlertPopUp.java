package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertPopUp {

	public static WebDriver driver;

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

		WebElement alertBox= driver.findElement(By.xpath("//button[@name='alertbox']"));
		WebElement cancleconfirmationAlert= driver.findElement(By.xpath("//button[@name='confirmalertbox']"));

		alertBox.click();
		acceptAlert();

		cancleconfirmationAlert.click();
		cancleAlert();

	}


	public static void acceptAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
		//	wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();

		} catch (Exception e) {
			//exception handling
		}
	}

	public static void cancleAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
		//	wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.dismiss();
		} catch (Exception e) {
			//exception handling
		}
	}

}
