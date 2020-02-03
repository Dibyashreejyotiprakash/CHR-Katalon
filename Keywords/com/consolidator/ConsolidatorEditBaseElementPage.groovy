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
	By price = By.xpath("//*[@id='MainContent_MainContent_txtprice']")
	By qtyperpack = By.xpath("//*[@id='MainContent_MainContent_txtquantity']")
	By estimatednoofversion = By.xpath("//*[@id='MainContent_MainContent_txtestversion']")
	By estimatedtotalqty = By.xpath("//*[@id='MainContent_MainContent_txtestquantity']")
	By savechangesbutton = By.xpath("//*[@id='btnEdit']")


	@Keyword
	public void VerifyEditElementpage() {

		try{
			action.VerifyCurrentPage("ConsolidatorEditBaseElement.aspx")
			boolean statusofeditelementlabale = action.IsElementDisplayed(editelement)
			Assert.assertTrue(statusofeditelementlabale)
		}
		catch(Exception e) {
			Assert.fail("Verify Edit Element page failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyBackBtn() {
		try{
			boolean statusofbackbtn = action.IsElementDisplayed(backbtn)
			Assert.assertTrue(statusofbackbtn)
			action.Click(backbtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			Assert.fail("Verify Back Btn failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyDeleteBtn() {
		boolean statusofvisisblityofdeletebtn = action.IsElementDisplayed(deletelementbtn)
		Assert.assertTrue(statusofvisisblityofdeletebtn)

		boolean statusofenablityofdeletebtn = action.IsElementEnabled(deletelementbtn)
		Assert.assertTrue(statusofenablityofdeletebtn)
	}


	@Keyword
	public void EditDetailsAndSave() {
		try{
			action.TypeClear(price, "100")


			boolean statusofsavechangesbtn = action.IsElementEnabled(savechangesbutton)
			Assert.assertTrue(statusofsavechangesbtn)
			if(statusofsavechangesbtn == true) {
				action.Click(savechangesbutton)
			}
			else{
				throw new Exception ("Add New element is disabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Search Element failed due to "+ e)
		}
	}
}
