package genricMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysCharSequence {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement usertxt=driver.findElement(By.id("txtUsername"));


//String Builder
		/*StringBuilder username=new StringBuilder()
				.append("Admin")
				.append(" ")
				.append("automation")
				.append(" ")
				.append("Labs")
				.append(" ")
				.append("Selenium");

		usertxt.sendKeys(username);*/
		
		
// String Buffer
		/*StringBuffer username1=new StringBuffer()
				.append("Admin")
				.append(" ")
				.append("automation")
				.append(" ")
				.append("Labs")
				.append(" ")
				.append("Selenium");
		usertxt.sendKeys(username1);*/
		
//StringBulider ,StringBuffer,String, key
		
		StringBuilder username=new StringBuilder()
				.append("Admin")
				.append(" ")
				.append("automation") 
				.append(" ")
				.append("TestNG")
				.append(" ")
				.append("Selenium");
		
		String space=" ";
		StringBuffer userInfo=new StringBuffer()
				.append("Test")
				.append(" ")
				.append("WebDriver");
		
		String author= "Vianyak";
		
		usertxt.sendKeys(username,space,userInfo,space,author,Keys.TAB);
		
		
		
		
		
		
		
	}

}
