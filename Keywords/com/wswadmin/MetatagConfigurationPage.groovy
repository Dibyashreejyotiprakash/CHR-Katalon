package com.wswadmin

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
//import internal.GlobalVariable
import java.time.LocalTime
import com.utilities.Interaction
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory

public class MetatagConfigurationPage {

	WebDriver driver = DriverFactory.getWebDriver();
	Interaction action = new Interaction();

	By metatag = By.xpath("//*[@class='ExternalItemPlaceHolder']/fieldset[1]//div/span")

	@Keyword
	public void VerifyMetaTag() {
		List<WebElement> metatags = driver.findElements(By.xpath("//*[@class='ExternalItemPlaceHolder']/fieldset[1]/table//tr/td/label//div"))
		for(Object name : metatags) {
			LocalTime currenttime = LocalTime.now()
			String expmetatag = "Test"+ currenttime
			String metatagname = name.getText()
			if(metatagname.contains("Test")) {
				println ("Created New Meta tag found")
			}
		}
	}
}
