package genricMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
public class LaunchIEBrowser {

	
	@Test
	public  void LaunchIE() {
		// TODO Auto-generated method stub
		
			  	    	      
		            // System Property for IEDriver   
		        System.setProperty("webdriver.ie.driver", "C://Users//MAYURI//Desktop//Software//IE_Driver//IEDriverServer.exe");  
		          
		           // Instantiate a IEDriver class.       
		        WebDriver driver=new InternetExplorerDriver();  
		          
		        try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		           // Launch Website  
		        driver.get("https://www.msn.com/en-in/?ocid=iehp");  
		          
		           //Maximize the browser  
		          driver.manage().window().maximize();  
		            
		
	}

}
