package listeners;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.HMS.genericUtils.Baseclass;
import com.HMS.genericUtils.Listimpclass;

import pomrepository.Admindashboardpage;
import pomrepository.Adminloginpage;
import pomrepository.Welcomepage;

 
public class Listenerspractice extends Baseclass{

	@Test
	public void ts_01()
	{
		System.out.println("script 1");
		fail();
	}
	@Test
	public void ts_02()
	{
		System.out.println("script 2");
	}
	
	
}
