package genricMethod;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	//Pre- Condition annotaion -- starting with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite--- setup system proprty for crome");
	}

	@BeforeClass
	public void lounchBrowser()
	{
		System.out.println(" @BeforeClass--- Launch Chrome Broser");
	}

	@BeforeMethod
	public void enterURL()
	{
		System.out.println("@BeforeMethod-- Enter URL");
	}

	@BeforeTest
	public void login()
	{
		System.out.println("@BeforeTest--- Login Method");
	}

	// test cases -- starting with @Test
	@Test //1
	public void googleTitleTest()
	{
		System.out.println(" @Test-- Google Title Test");
	}
	
	
	@Test //2
	public void searchTest()
	{
		System.out.println("@Test--- Search Test");
	}

	@Test //3
	public void googleLogoTest()
	{
		System.out.println("@Test--- google Logo Test");
	}

	//post cases -- starting with @After
	@AfterMethod
	public void logOut()
	{
		System.out.println(" @AfterMethod---  Logout from app");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest--- deleteAllCookies");
	}

	@AfterClass
	public void closeBrowser()
	{
		System.out.println("@AfterClass---close Browser");
	}

	@AfterSuite
	public void generateTestReport()
	{
		System.out.println(" @AfterSuite--- generate Test Report");
	}



}
