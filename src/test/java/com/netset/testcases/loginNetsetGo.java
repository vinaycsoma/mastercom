package com.netset.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.netset.pages.*;
import com.netset.pages.baseClass;
import com.netset.pages.loginPage;

public class loginNetsetGo extends baseClass {

	@Test
	public void loginApp() throws InterruptedException {
        logger=report.createTest("Login to NetSetGo");
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		logger.info("Lunching application");
		login.loginToNetset(ex.getStringData("login", 0, 0), ex.getStringData("login", 0, 1)); // login page
		//login.loginToNetset("Poul","Mcts@123");
		logger.pass("Login success");
		
	}
	
	@Test(dependsOnMethods = "loginApp")
	public void deviceCreation() throws InterruptedException {
		 logger=report.createTest("Device creation");
		EvMetadataTableElement d = new EvMetadataTableElement(driver);
		 d.addDevice();
		 logger.pass("device created");
		
		}
	
	

}

