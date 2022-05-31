package genricMethod;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("login Test");
		//int i=9/0;  //Tests run: 4, Failures: 1, Skips: 3
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest()
	{
		System.out.println("searchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regPageTest()
	{
		System.out.println("regPageTest");
	}

}
