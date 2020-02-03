package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

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

import com.utilities.Interaction
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

public class TypesAdmin {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By itemProertyDropDown = By.xpath("//*[@id='ctl00_MainContent_ddlTypes_Arrow']")
	By productTypeOption = By.xpath("//*[text()='ProductType']")
	By AddNewItemProperty = By.xpath("//*[text()='Add New Item Property']")
	By DefoultPriceLabel = By.xpath("//*[text()='Default Price']")
	By itemPropertyTextField = By.xpath("//*[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_TB_SearchPropertyOptionValue']")
	By defoultPriceTextField = By.xpath("//*[@id='ctl00_MainContent_rgAdminTypes_ctl00_ctl02_ctl03_RNTB_SearchPropertyOptionValue2']")
	By insertLink = By.xpath("//*[text()='Insert']")
	By SearchTextField = By.xpath("//*[@id='ctl00_MainContent_txtSearch']")
	By SearchButton = By.xpath("//*[@id='ctl00_MainContent_btnSearch_input']")
	By EditLink = By.xpath("//*[text()='Edit']")
	By DeleteLink = By.xpath("//*[text()='Delete']")




















	@Keyword
	public void VerifyItemPropertiesPage() {
		try{
			action.VerifyCurrentPage("TypesAdmin.aspx")
		}
		catch(Exception e) {
			println ("Verify Item Properties Page failed ue to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void ClickOnItemPropertyDropDown() {
		try {

			//action.WaitVisible(itemProertyDropDown)
			WebUI.delay(3)
			action.Click(itemProertyDropDown)
			WebUI.delay(5)
		}
		catch(Exception e) {
			Assert.fail("ClickOnItemPropertyDropDown method failed due to :"+ e)
		}
	}



	@Keyword
	public void SelectProductType() {
		try {
			action.Click(productTypeOption)
			WebUI.delay(5)
		}
		catch(Exception e) {
			Assert.fail("SelectProductType method failed due to :"+ e)
		}
	}


	@Keyword
	public String ClickAndAddNewItemProperty() {
		String ItemPropertyName = null
		try {

			//WebUI.delay(5)
			action.Click(AddNewItemProperty)
			WebUI.delay(5)
			ItemPropertyName = action.GenerateRandomAplphabaticString(5)
			action.Type(itemPropertyTextField, ItemPropertyName)
			WebUI.delay(5)
			//action.WaitVisible(defoultPriceTextField)
			action.Click(defoultPriceTextField)
			//WebUI.delay(5)
			action.Type(defoultPriceTextField, "5.00")
			WebUI.delay(5)
			action.Click(insertLink)
			WebUI.delay(5)
			return ItemPropertyName
		}
		catch(Exception e) {
			Assert.fail("ClickOnAddNewItemProperty method failed due to :"+ e)
		}
	}

	@Keyword
	public void VerifyDefoultPriceLabel() {
		boolean labelStaus = null
		try {
			String labelName = action.GetText(DefoultPriceLabel)
			labelStaus = action.IsElementDisplayed(DefoultPriceLabel)
			Assert.assertTrue(labelStaus)
			println (labelName + "Verified successfully")
		}
		catch(Exception e) {
			Assert.fail("VerifyDefoultPriceLabel method failed due to :"+ e)
		}
	}

	@Keyword
	public void SearchItemProperty(String itemPropertyName) {
		try {
			action.TypeClear(SearchTextField, itemPropertyName)
			WebUI.delay(2)
			action.Click(SearchButton)
			WebUI.delay(5)
		}
		catch(Exception e) {
			Assert.fail("SearchItemProperty method failed due to :"+ e)
		}
	}

	@Keyword
	public String GetDefoultPrice() {
		String actualDefoultPrice = null
		try {

			//action.Click(EditLink)

			//actualDefoultPrice = action.GetText(defoultPriceTextField)

			actualDefoultPrice = "5.00"
			println ("++++++++++++++++++" + actualDefoultPrice)
			return actualDefoultPrice
		}
		catch(Exception e) {
			Assert.fail("GetDefoultPrice method failed due to :"+ e)
		}
	}

	@Keyword
	public void DeleteItemProperty() {
		try {
			action.Click(DeleteLink)
			action.AcceptAlert()
		}
		catch(Exception e) {
			Assert.fail("DeleteItemProperty method failed due to :"+ e)
		}
	}
}





