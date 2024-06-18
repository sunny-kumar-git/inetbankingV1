package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File scr = new File ("C:\\Git Project\\inetBankingV1\\Configuration\\config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
				
	}
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("baseUrl");
		return url;
	}
	
	public String getUsername()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}

}
