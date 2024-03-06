package testNGpractice;

import org.testng.annotations.Test;

import com.HMS.genericUtils.Baseclass;

public class Sampletest extends Baseclass
{	
	@Test
	public void ts_01()
	{
		System.out.println("Testscript--1");
	}
    @Test
    public void ts_02()
    {
    	System.out.println("Testscript--2");
    }
}
