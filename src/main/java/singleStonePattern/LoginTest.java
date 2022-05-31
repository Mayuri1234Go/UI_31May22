package singleStonePattern;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeClass
	public void setUp()
	{
		TestBaseSingleStone.initialize();
	}

	@Test
	public void VerifyTitleTest()
	{
		String title=TestBaseSingleStone.driver.getTitle();
		System.out.println("Page Title"+ title);
		Assert.assertEquals(title, Constants.loginPage);
	}

	@Test
	public void VerifyLoginTest()
	{
		TestBaseSingleStone.driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		TestBaseSingleStone.driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		TestBaseSingleStone.driver.findElement(By.id("btnLogin")).click();
		System.out.println("Click submit btn");

		String title1=TestBaseSingleStone.driver.getTitle();
		System.out.println("Page Title"+ title1);
		Assert.assertEquals(title1, Constants.loginPage);
	}

	@AfterClass
	public void tearDown()
	{
		TestBaseSingleStone.quit();

	}

}
