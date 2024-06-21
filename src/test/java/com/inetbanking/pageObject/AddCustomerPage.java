package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement lnkAddNewCustomer;
	
	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	WebElement txtCustomerName;
	
	@FindBy(name="rad1")
	WebElement rdGender;
	
	@FindBy(name="dob")
	WebElement txtdob;
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtCity;	
	
	@FindBy(name="state")
	WebElement txtState;
	
	@FindBy(name="pinno")
	WebElement txtPincode;
	
	@FindBy(name="telephoneno")
	WebElement txttele;
	
	@FindBy(name="emailid")
	WebElement txtMailID;
	
	@FindBy(xpath=" //tbody/tr[13]/td[2]/input[1]")
	WebElement btnSubmit;
	
	public void clickNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void custDOB(String mm, String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	
	public void custAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity)
	{
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void custPin(String cpin)
	{
		txtPincode.sendKeys(String.valueOf(cpin));
	}
	
	public void custTele(String ctele)
	{
		txttele.sendKeys(ctele);
	}
	
	public void custEmailid(String cEmailid)
	{
		txtMailID.sendKeys(cEmailid);
	}
	
	
	
	public void custSubmit()
	{
		btnSubmit.click();
	}
	
	
	

}
