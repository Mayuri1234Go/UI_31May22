package genricMethod;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int counter =0;
	int reteylimit=3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<reteylimit)
		{
			counter++;
			return true;
		}
		return false;
	}

}
