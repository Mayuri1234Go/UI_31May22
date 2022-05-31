package genricMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * Created By Vinayak Waghchaure
 */
public class CheckBoxHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		WebElement accept=driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));

		accept.click();
		WebElement radio=driver.findElement(By.id("doi0"));
		Actions actions=new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		WebElement marketAutomationchk=	driver.findElement(By.name("interest_market_c"));
		WebElement SalesAutomation =driver.findElement(By.name("interest_sell_c"));

		/*Thread.sleep(2000);
		System.out.println("click the checkbox Marketing Automation");
	WebElement marketAutomationchk	driver.findElement(By.name("interest_sell_c")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("interest_sell_c")).click();

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());*/
		
		select_Checkbox(marketAutomationchk);
		select_Checkbox(SalesAutomation);		
		deSelect_Checkbox(marketAutomationchk);		
		
		
	}
	
	public  static void select_Checkbox(WebElement element) {
		
		try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element.getText() + "is already selected");
            } else {
            	// Select the checkbox
                element.click();
                System.out.println("Checkbox: " + element.getText() + "is selected");

            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
		
	}
	
	
	public static void deSelect_Checkbox(WebElement element) {
		try {
            if (element.isSelected()) {
            	//De-select the checkbox
                element.click();
            } else {
            	System.out.println("Checkbox: "+element.toString()+"is already deselected");
            }
        } catch (Exception e) {
        	System.out.println("Unable to deselect checkbox: "+element.getText());
        }
    }		

}
