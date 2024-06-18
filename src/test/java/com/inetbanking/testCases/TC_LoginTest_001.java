package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;




public class TC_LoginTest_001 extends BaseClass 
{
	

	@Test
	public void loginTest() throws InterruptedException
	{
		//driver.get(baseUrl);
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		Reporter.log("username Entered",true);
		lp.setPassword(password);
		Reporter.log("password Entered",true);
		
		lp.clickSubmit();
		Reporter.log("button clicked", true);
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
		 //Assert.assertTrue(true);
			//System.out.print("The page Title is matching ");
			Reporter.log("The page Title is matching", true);
		}
		else 
		{
			
			//Assert.assertTrue(false);
			System.out.print("The page Title is not matching");
		}
		
		
	}
	

}
