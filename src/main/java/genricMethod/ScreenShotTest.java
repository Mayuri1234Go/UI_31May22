package genricMethod;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListner.class)
public class ScreenShotTest extends BaseScreenshot{
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
	@Test
	public void takeScreenshotTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void createDealsTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void homePageTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown()
	{
	  driver.quit();
	}


}
