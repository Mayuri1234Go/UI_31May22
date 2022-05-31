package genricMethod;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	/*@Test(invocationCount=2,expectedExceptions=NumberFormatException.class)
	public void infintLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
		
	}*/
	
	//java.lang.NumberFormatException: For input string: "100A" 
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x="100A";
		Integer.parseInt(x);
	}
	
	

}
