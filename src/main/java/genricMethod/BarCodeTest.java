package genricMethod;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

/*
 * Vianyak Waghchaure
 */
public class BarCodeTest {

	@Test
	public void barcodeTest() throws IOException, NotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		driver.get("https://barcode.tec-it.com/en");


		String barCodeURL=driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barCodeURL);

		URL url=new URL(barCodeURL);
		BufferedImage bufferedImage=ImageIO.read(url); 
		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result=  new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
	}

	@Test
	public void barcodeTest1() throws IOException, NotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "D://JavaPractice/UIYesbank/Drivers/Cromedriver100/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		driver.get("https://barcode.tec-it.com/en/?data=vinayak");

		String barCodeURL=driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(barCodeURL);

		URL url=new URL(barCodeURL);
		BufferedImage bufferedImage=ImageIO.read(url); 
		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result=  new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
	}

}
