package Tests;

import org.testng.annotations.Test;

import Library.Excellibrary;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

//import Pages.Createcustomer;
import Pages.Loginpage;


public class LoginLogoutTest extends Baseclass
{
	Excellibrary xllib = new Excellibrary();
	@Test
	public void testLoginLogout() throws Exception
	{

		String username=xllib.getExcelData("sheet1",1,0);
		String password=xllib.getExcelData("sheet1",1,1);
		Loginpage lp=new Loginpage(driver);
		lp.Login(username, password);
	
	
	//	Createcustomer cus=new Createcustomer(driver);
	//	cus.createcustomer("name");	
		
		/*Createproject cp=new Createproject(driver);
		cp.createproject("name");
		*/
	}
}

