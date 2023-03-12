package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider 
{
	
	Properties pro;
	public ConfigDataProvider() throws Exception
	{
	String filepath="C:\\Testing WorkSpace2\\Automation_Framework\\config\\config.properties";
	FileInputStream fis=new FileInputStream(filepath);
	pro=new Properties();
	pro.load(fis);//To Load Config Data File
	}
	
public String getBaseurl()//Method created to get data from Config data file Config.property 
{
	return pro.getProperty("BaseUrl");//BaseUrl is key from configdata file
}

public String getBrowserChrome()//Method created to get data from Config.property 
{
	return pro.getProperty("BrowserChrome");
}

public String getBrowserEdge()//Method created to get data from Config.property 
{
	return pro.getProperty("BrowserEdge");
}

public String getExcelPath()
{
	return pro.getProperty("ExcelPath");
}
}

