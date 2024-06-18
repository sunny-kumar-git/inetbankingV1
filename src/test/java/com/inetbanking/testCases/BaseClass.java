package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	//public String baseUrl = "https://demo.guru99.com/V1/index.php";
	public String baseUrl = readConfig.getApplicationUrl();
	//public String username = "mngr576859";
	public String username = readConfig.getUsername();
	//public String password = "tagYzAj";
	public String password = readConfig.getPassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Git Project\\inetBankingV1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		Reporter.log("Chrome launched", true);
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Git Project\\inetBankingV1\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			Reporter.log("firefox launched", true);	
			}
		else {
			System.out.println("Invalid Entry");
		}
		driver.get(baseUrl);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
