package genricMethod;

import org.testng.annotations.Test;

public class InvocationCountTest {
	//if you want same test case again & again multiple time
	@Test(invocationCount=10) // only need to count 
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is =="+ c);
		
	}

	//Tests run: 10, Failures: 0, Skips: 0
}
