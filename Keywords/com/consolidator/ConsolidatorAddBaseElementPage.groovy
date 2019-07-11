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
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ConsolidatorAddBaseElementPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By 	addnewelementlable = By.xpath("//*[text()='Add New Element']")
	By searchtextbox = By.xpath("//*[@id='searchExternalElementId']")
	By backbtn = By.xpath("//*[@href='ConsolidatorManageBaseElement.aspx']")

	@Keyword
	public void VerifyAddNewElementPage() {
		boolean statusoflabel = action.IsElementDisplayed(addnewelementlable)
		Assert.assertTrue(statusoflabel)
	}


	@Keyword
	public void VerifyBackButton() {
		boolean statusofbackbutton = action.IsElementDisplayed(backbtn)
		Assert.assertTrue(statusofbackbutton)
		
		boolean statusofenablitybackbutton = action.IsElementEnabled(backbtn)
		Assert.assertTrue(statusofenablitybackbutton)
	}

	@Keyword
	public void VerifySearchTextBox() {
		boolean statusofsearchbox = action.IsElementDisplayed(searchtextbox)
		Assert.assertTrue(statusofsearchbox)

		if(statusofsearchbox == true) {
			action.Type(searchtextbox, "Test")
			WebUI.delay(2)
		}
	}
}
