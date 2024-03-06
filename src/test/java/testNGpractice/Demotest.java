package testNGpractice;

import static org.testng.Assert.fail;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;


import com.HMS.genericUtils.Baseclass;
import com.HMS.genericUtils.Retryimplementation;

public class Demotest
{ 

	@Test(retryAnalyzer = Retryimplementation.class )
	public void ts_o3()
	{
		System.out.println("test script 3");
		fail();
	}
	
}
