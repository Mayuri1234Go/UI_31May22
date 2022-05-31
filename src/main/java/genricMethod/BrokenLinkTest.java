package genricMethod;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		//	driver.manage().timeouts().pageLoadTimeout(0,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.get("https://www.zlti.com/");

		//1.get the list of all the links and images
		List <WebElement> linkslist= driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of linkslist  list :"+linkslist.size());


		List <WebElement> activeLinks= new ArrayList<WebElement>();

		//2.iterate linklist: exclude all the link/images- dose not have any attribute
		for (int i = 0; i < linkslist.size(); i++) {
			if(linkslist.get(i).getAttribute("href")!=null)
			{
				activeLinks.add(linkslist.get(i));
			}

		}


		//get the size of active link list

		System.out.println("size of active link list :"+activeLinks.size());

		//3. check the href url, with httpconnnection api:
		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection=(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();

			connection.connect();
			String response=connection.getResponseMessage(); //ok
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"-----> "+ response);
		}




	}

}
