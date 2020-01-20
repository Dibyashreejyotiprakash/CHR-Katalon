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


	By addnewelementlable = By.xpath("//*[text()='Add New Element']")
	By searchtextbox = By.xpath("//*[@id='searchExternalElementId']")
	By backbtn = By.xpath("//*[@href='ConsolidatorManageBaseElement.aspx']")
	By firstsugestedelement = By.xpath("//*[@id='ui-id-1']//li[1]")
	By price = By.xpath("//*[@id='txtPrice']")
	By qtyperpack = By.xpath("//*[@id='txtQuantity']")
	By estimatednoofversion = By.xpath("//*[@id='txtVersion']")
	By estimatedtotalqty = By.xpath("//*[@id='txtTotalQuantity']")
	By addelementbtn = By.xpath("//*[@id='btnEditSelected']")
	By consLoader = By.xpath("//div[@id='divLoading']")


	@Keyword
	public void VerifyAddNewElementPage() {
		try{
			action.VerifyCurrentPage("Consolidator/ConsolidatorAddBaseElement.aspx")
			boolean statusoflabel = action.IsElementDisplayed(addnewelementlable)
			Assert.assertTrue(statusoflabel)
		}
		catch(Exception e) {
			Assert.fail(" Verify add base element page failed due to "+ e)
		}
	}

	@Keyword
	public void SearchElementAndAdd() {
		try{
			action.WaitTillNotVisible(consLoader, 30)
			action.Type(searchtextbox, "AIR-M1")
			WebUI.delay(2)
			action.Click(firstsugestedelement)
			action.Type(price, "100")
			action.Type(qtyperpack, "12")
			action.Type(estimatednoofversion, "11")
			action.Type(estimatedtotalqty, "10")

			boolean statusofaddelement = action.IsElementEnabled(addelementbtn)
			Assert.assertTrue(statusofaddelement)
			if(statusofaddelement == true) {
				action.Click(addelementbtn)
				action.WaitForPageToLoad()
			}
			else{
				throw new Exception ("Add New element is disabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Search Element failed due to "+ e)
		}
	}


	@Keyword
	public void AddNewElementWithoutAddingOptionalDetails() {
		try{
			//action.Type(searchtextbox, "Test")
			action.WaitTillNotVisible(consLoader, 30)
			action.Type(searchtextbox, "AIR-M1")
			WebUI.delay(2)
			action.Click(firstsugestedelement)
			action.Type(price, "100")
			action.Type(qtyperpack, "12")

			boolean statusofaddelement = action.IsElementEnabled(addelementbtn)
			Assert.assertTrue(statusofaddelement)
			if(statusofaddelement == true) {
				action.Click(addelementbtn)
				action.WaitForPageToLoad()
			}
			else{
				throw new Exception ("Add New element is disabled")
			}
		}
		catch(Exception e) {
			Assert.fail("Search Element failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddNewelementBeforeAndAfterEntryDetails() {
		try{

			boolean statusofaddelementbtn = false
			action.WaitTillNotVisible(consLoader, 30)
			action.Type(searchtextbox, "AIR-M1")
			WebUI.delay(2)
			action.Click(firstsugestedelement)

			//WebUI.delay(2)
			/*statusofaddelementbtn = action.IsElementEnabled(addelementbtn)
			 Assert.assertFalse(statusofaddelementbtn)
			 println(action.IsElementEnabled(statusofaddelementbtn))*/

			action.Type(price, "100")
			action.Type(qtyperpack, "12")

			statusofaddelementbtn = action.IsElementEnabled(addelementbtn)
			Assert.assertTrue(statusofaddelementbtn)
		}
		catch(Exception e) {
			Assert.fail("Search Element failed due to "+ e)
		}
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
			//WebUI.delay(2)
		}
	}
}
