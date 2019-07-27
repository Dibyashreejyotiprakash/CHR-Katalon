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
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.deleteClause_scope
import org.openqa.selenium.Alert
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class ConsolidatorEditBaseElementPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By editelement = By.xpath("//*[text()='Edit Element']")
	By backbtn = By.xpath("//*[@href='ConsolidatorManageBaseElement.aspx?']")
	By deletelementbtn = By.xpath("//*[@class='remove full-width']")

	@Keyword
	public void VerifyEditElementpage() {
		boolean statusofeditelementlabale = action.IsElementDisplayed(editelement)
		Assert.assertTrue(statusofeditelementlabale)
	}

	@Keyword
	public void VerifyBackBtn() {
		boolean statusofbackbtn = action.IsElementDisplayed(backbtn)
		Assert.assertTrue(statusofbackbtn)
		action.Click(backbtn)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void VerifyDeleteBtn() {
		boolean statusofvisisblityofdeletebtn = action.IsElementDisplayed(deletelementbtn)
		Assert.assertTrue(statusofvisisblityofdeletebtn)

		boolean statusofenablityofdeletebtn = action.IsElementEnabled(deletelementbtn)
		Assert.assertTrue(statusofenablityofdeletebtn)
	}
}
