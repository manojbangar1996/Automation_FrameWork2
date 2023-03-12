package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;


public class Login_Test1  extends BaseClass
{
	@Test
	public void verify_LoginPage()
	{
		//get Element from LoginPom Class from src/main/java
		
	LoginPom login=	PageFactory.initElements(driver,LoginPom.class);
//	login.getTxt_email().sendKeys(excel.getStringData_Excel("Login", 0, 0));
//	login.getTxt_password().sendKeys(excel.getStringData_Excel("Login", 0, 1));
	login.getTxt_email().sendKeys("manoj@12345");
	login.getTxt_password().sendKeys("12345");
	login.getBtn_login().click();
		
	}
	
}
