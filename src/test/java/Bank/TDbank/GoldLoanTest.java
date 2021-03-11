package Bank.TDbank;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GoldLoanTest 
{
	@BeforeGroups("smoketest")

	public void beforeGroup()
	{
		System.out.println("beforeGroup");
	}
	
	
	@Test (groups= {"smoketest"})
	public void webLogin()
	{
	System.out.println("goldLoanTest-->webLogin");	
	}

	@Test

	public void mobileLogin()
	{
		System.out.println("goldLoanTest-->mobileLogin");
	}
	
	@Test

	public void mobile1LoginAvi()
	{
		System.out.println("goldLoanTest-->Avi");
	}
	
	@Test

	public void mobile2LoginKvi()
	{
		System.out.println("goldLoanTest-->Kvi");
	}
	
	@Test
	public void apiLogin()
	{
		System.out.println("goldLoanTest-->apiLogin");
	
	}
	
	@Test(groups= {"smoketest"})
	public void mobileAviLogin4()
	{
		System.out.println("mobileAviLogin4");
	}
	@Test(groups= {"regressiontest"})
	public void mobileAviLogin1()
	{
		System.out.println("mobileAviLogin1");
	}
	@Test(groups= {"smoketest"})
	public void mobileAviLogin2()
	{
		System.out.println("mobileAviLogin2");
	}
	@Test(groups= {"uitest"})
	public void mobileAviLogin3()
	{
		System.out.println("mobileAviLogin3");
	}
	@Test(groups= {"smoketest","uitest"})
	public void aviMobileLogin()
	{
		System.out.println("aviMobileLogin");
	}
	
	@Test(groups= {"uitest"})
	public void Avi()
	{
		System.out.println("Avi");
	}
	
	
}
