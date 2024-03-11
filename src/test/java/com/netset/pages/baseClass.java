package com.netset.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.netset.utility.BrowserFactory;
import com.netset.utility.Helper;
import com.netset.utility.excelDataProvider;

public class baseClass {
	public WebDriver driver;
	
	public excelDataProvider ex;
	public ExtentReports report;
	public ExtentTest logger;
	@BeforeSuite
	public void setUpSuite()
	{
		ex=new excelDataProvider();
		//String path = System.getProperty("user.dir")+"/reports/report.html";
	//	ExtentSparkReporter extent=new ExtentSparkReporter(path);
		ExtentSparkReporter extent=new ExtentSparkReporter("./reports/report"+Helper.getCurrentDate()+".html");
		report=new ExtentReports();
		report.attachReporter(extent);
				
	}
	@BeforeClass
	public void startup() 
	{
		driver=BrowserFactory.startApplication(driver, "Chrome","https://192.168.4.113/");
		
			}
	@AfterClass
    public void exit() throws InterruptedException {
    	BrowserFactory.quitBrowser(driver);
    }
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			
			Helper.captureScreenShot(driver);
			logger.fail("Test Failed");
			
		}
		report.flush();
}
}