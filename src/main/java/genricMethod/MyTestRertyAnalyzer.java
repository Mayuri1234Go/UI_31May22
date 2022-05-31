package genricMethod;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import org.testng.Assert;


public class MyTestRertyAnalyzer {

	/*@Test(retryAnalyzer =RetryAnalyzer.class)
	public void Test1()

	{
		Assert.assertEquals(false, true);
	}

	@Test(retryAnalyzer =RetryAnalyzer.class)
	public void Test2()

	{
		Assert.assertEquals(false, true);
	}*/

	@Test
	public void Test1()

	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()

	{
		Assert.assertEquals(false, true);

	}
	@Test
	public void Test3()

	{
		Assert.assertEquals(true, true);

	}
}
