package com.PrachiGupta.Utilities;

import java.io.FileInputStream;


import java.util.Properties;
public class ReadConfig {

	Properties properties;	
	String path="C:\\Users\\User\\eclipse-workspace\\PrachiGupta\\src\\test\\java\\com\\PrachiGupta\\Utilities\\ReadConfig.java";
	
	public ReadConfig() {
		try {
		properties=new Properties();
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
		public String getbaseUrl() {
		String value=	properties.getProperty("baseUrl");
	
		if(value!=null)
			return value;
	else {
		throw new RuntimeException("url not specified");
	}
 }
		public String getbrowser() {
			String value=	properties.getProperty("baseUrl");
		
			if(value!=null)
				return value;
		else{
			throw new RuntimeException("url not specified");
		}		
}
		public String getid() {
			String value=	properties.getProperty("baseUrl");
		
			if(value!=null)
				return value;
		else{
			throw new RuntimeException("url not specified");
		}		
	}
		
public String getpass() {
	String value=	properties.getProperty("baseUrl");

	if(value!=null)
		return value;
else{
	throw new RuntimeException("url not specified");
}		
	}
}