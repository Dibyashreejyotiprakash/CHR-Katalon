package com.iidtm.release

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.utilities.DemooInteractions
import com.utilities.Interactions
import com.kms.katalon.core.webui.driver.DriverFactory


import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

public class IIDTM529 {


	Interactions action = new Interactions();
	DemooInteractions actions = new DemooInteractions();
	WebDriver driver = DriverFactory.getWebDriver();


	@Keyword
	def II4Login() {
		
		driver.findElement(By.id("UserName")).sendKeys("demoQA@brandmuscle.com");
		driver.findElement(By.id("Password")).sendKeys("go2web");
		driver.findElement(By.id("btnLogin")).click();
		WebElement corpelement = driver.findElement(By.id("ddlCorporation"));
		WebElement distelement = driver.findElement(By.id("ddlDistributer"));
		Select sc= new Select(corpelement);
		sc.selectByIndex(1);
		sc = new Select(distelement);
		sc.selectByIndex(1);
		//action.Type(null, "")
	    
	}
}
