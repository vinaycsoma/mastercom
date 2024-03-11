package com.netset.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.netset.utility.excelDataProvider;


public class EvMetadataTableElement {
	WebDriver driver;
	Actions act;
	String url;
	
	
	excelDataProvider ex;
	public EvMetadataTableElement(WebDriver d) {
	this.driver=d;
	}
	public void addDevice() throws InterruptedException {
		ex=new excelDataProvider();
		
		driver.findElement(By.xpath("//div[contains(text(),'Event Viewer Metadata')]")).click();
		act = new Actions(driver);
		
	    url=driver.getCurrentUrl();
	    System.out.print(url);
		Assert.assertTrue(url.contains("https://192.168.4.113/#/event-viewer-metadata"));
		
		
		/*
		WebElement loc = driver.findElement(By.xpath("//select[@id='bind1']"));
		Select s = new Select(loc);
		//s.selectByVisibleText("Salwa Road");
		s.selectByVisibleText(ex.getStringData("device", 1, 0));
		//assertEquals(true, loc);
		driver.findElement(By.xpath("//ng-select[@id='bind3']//input[@role='combobox']")).click();
		List<WebElement> vType = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
		dDropDown.dropdown(vType, ex.getStringData("device", 1, 1));
		driver.findElement(By.xpath("//ng-select[@id='bind7']//input[@role='combobox']")).click();
		Thread.sleep(100);
		List<WebElement> dType = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
		dDropDown.dropdown(dType, ex.getStringData("device", 1, 2));
		driver.findElement(By.id("NEName")).sendKeys(ex.getStringData("device", 1, 3));
		driver.findElement(By.id("Description")).sendKeys(ex.getStringData("device", 1, 4));
		driver.findElement(By.id("serialno")).sendKeys(String.valueOf((int)ex.getNumericData("device", 1, 5)));

		driver.findElement(By.xpath("//ng-select[@id='bind394']//input[@role='combobox']")).click();
		// act.sendKeys(Keys.DOWN).perform();
		//act.sendKeys(Keys.ENTER).perform();
		List<WebElement> oType = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
		
		dDropDown.dropdown(oType, ex.getStringData("device", 1, 6));
		WebElement status = driver.findElement(By.xpath("//select[@id='bind6']"));
		Select sts = new Select(status);
		sts.selectByValue("3");

		driver.findElement(By.id("RollOutDate")).sendKeys("23-06-2023 15:55");
		Thread.sleep(100);
		act.sendKeys(Keys.ENTER).perform();

	 driver.findElement(By.cssSelector("button[type='submit']")).click();
		// String stat=driver.findElement(By.xpath("//p[@class='notifier__notification-message']")).getText();
		// System.out.print(stat);
		// Assert.assertTrue(stat.contains("[200]: Successful: NE Inserted Sucessfully"));
			Thread.sleep(100);*/

	}

}
