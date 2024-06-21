package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.AddCustomerPage;
import com.inetbanking.pageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcus= new AddCustomerPage(driver);
		
		try
		{
		addcus.clickNewCustomer();
		Thread.sleep(3000);
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		driver.get("https://demo.guru99.com/V1/html/Managerhomepage.php");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Close']")).click();
		//driver.get(baseUrl);
		//Thread.sleep(3000);
		addcus.clickNewCustomer();
		Thread.sleep(2000);
		addcus.custName("Sunny");
		Thread.sleep(1000);
		addcus.custGender("Male");
		
		addcus.custDOB("12","18","1994");
		Thread.sleep(3000);
		
		addcus.custAddress("India");
		addcus.custCity("Patna");
		addcus.custState("Bihar");
		addcus.custPin("800008");
		addcus.custTele("12345");
		Thread.sleep(2000);
		
		String email=randomestring()+"@gmail.com";
		addcus.custEmailid(email);
		Thread.sleep(1000);
		addcus.custSubmit();
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully");
		
		if(res==true)
			System.out.println("Customer added successfully");
		else
			System.out.println("Customer not added successfully");
	}

	
		public String randomestring()
		{
			String gereratedstring= RandomStringUtils.randomAlphabetic(8);
			return(gereratedstring);
		}
}
