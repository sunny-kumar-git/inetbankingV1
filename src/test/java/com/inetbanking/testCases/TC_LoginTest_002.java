
//Using DDT in login , reading data from excel sheet.

package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.Utilities.XLUtils;
import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd)
	{
	LoginPage lp = new LoginPage(driver);
	lp.setUserName(user);
	Reporter.log("username provided", true);
	lp.setPassword(pwd);
	Reporter.log("password provided", true);
	lp.clickSubmit();
	
	if(isAlertPresent()==true)
	{
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertTrue(true);	
	}
		
	}
	
	public boolean isAlertPresent()
	{
		try
		{		
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e) 
		{
			return false;
			
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData()throws IOException
	{
		String path = "C:\\Git Project\\inetBankingV1\\src\\test\\java\\com\\inetbanking\\testdata\\LoginData.xlsx";	
		
		int rownum= XLUtils.getRowCount(path,"Sheet1");
		int colcount = XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][] = new String[rownum][colcount]; 
				
		for (int i=1; i<=rownum;i++)
		{
			for(int j=0; j<colcount;j++)
			{
				logindata[i-1][j]= XLUtils.getCellData(path, "Sheet1",i,j);//1 0
			}		
		}
		return logindata;
		
		
	}

}
