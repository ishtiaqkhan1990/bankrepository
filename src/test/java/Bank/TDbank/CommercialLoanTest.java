package Bank.TDbank;

import org.testng.annotations.Test;

public class CommercialLoanTest 
{
@Test
public void webLogin()
{
System.out.println("commercialLoanTest-->webLogin");	
}

@Test(enabled = false)

public void mobileLogin()
{
	System.out.println("CommercialLoanTest-->mobileLogin");
}
@Test
public void apiLogin()
{
	System.out.println("CommercialLogin-->apiLogin");
}
}
