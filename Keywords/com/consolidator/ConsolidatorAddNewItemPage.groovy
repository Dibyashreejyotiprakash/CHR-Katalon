package com.consolidator

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
import com.utilities.Interaction
import org.openqa.selenium.By
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory


public class ConsolidatorAddNewItemPage {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By addnewelementlbl = By.xpath("//*[text()='Add New Element']")
	By searchelementtxtbox = By.xpath("//*[@id='searchExternalElementId']")
	By backbtn = By.xpath("//*[contains(@href,'ConsolidatorEditProgramItem.aspx')]")

	@Keyword
	public void VerifyAddNewElementPage() {
		try {
			boolean statusoflable = action.IsElementDisplayed(addnewelementlbl)
			Assert.assertTrue(statusoflable)
		}
		catch(Exception e) {
			println ( "Verify Add New Element Page failed due to "+ e)
			throw e
		}
	}

	@Keyword
	public void VerufyBackBtn() {
		try {
			boolean statusofbacklink = action.IsElementDisplayed(backbtn)
			Assert.assertTrue(statusofbacklink)
			if(statusofbacklink == true) {
				boolean statusofenablebacklink = action.IsElementEnabled(backbtn)
				Assert.assertTrue(statusofenablebacklink)
				action.Click(backbtn)
				action.WaitForPageToLoad()
			}
		}
		catch(Exception e) {
			println ( "Verify Add New Element Page failed due to "+ e)
			throw e
		}
	}
}
