package genricMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Setup {

	
	
	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		
	//	driver4.get("https://www.google.com/");
/*		WebDriver driver2 = new OperaDriver();
		WebDriver driver3 = new SafariDriver();
		WebDriver driver4 = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		WebDriver driver1 = new ChromeDriver();*/
	}
	
	
}
