package com.poswm

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

public class NewOrderPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By orderidbutton = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")
	By newitembtn = By.id("ctl00_MainContent_dockItemInformation_C_btnImgItemSearch")
	By firstaddlink = By.xpath("//*[@id='ctl00_MainContent_RadDock2_C_rgItemSearch_ctl00__0']/td[10]//a")

	By switchsalesdivision = By.xpath("//*[text()='Switch Sales Division']")
	By selectsalesdivisionddn = By.xpath("//*[text()='Select a sales division...']")
	By salesdivisionddnvalue = By.xpath("//*[text()='ADS - On Premise']")


	By addcustomerbtn = By.xpath("//*[text()='Add Customer']")
	By customernametxtbx  = By.xpath("//*[@id='ctl00_MainContent_dockCustomerInformation_C_rsbCustomers_Input']")
	By customername = By.xpath("//*[text()='BEST WHITESTONE LIQUOR (1409271)']")

	By calanderdesireddatebtn = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_calShipDate_popupButton']")
	By desireddate = By.xpath("//*[@title='Wednesday, July 17, 2019']")

	By shipmethodddn = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_ddlShippingMethod_Input']")
	By shipmethodddnvalue = By.xpath("//*[text()='Pickup By Salesperson']")

	By submitorder = By.xpath("//*[@id='ctl00_MainContent_btnSubmitOrder_input']")
	By cancelodrerbtn = By.xpath("//*[@id='ctl00_MainContent_btnCancelOrder_input']")

	By ordersuccessfullmsg = By.xpath("//*[contains(text()='Order successfully submitted.')]")

	By addedcustomersuccessfuliymsg = By.xpath("//*[text()='Customer has been selected.']")

	@Keyword
	public void VerifyNewOrderPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrders.aspx")
		}
		catch(Exception e) {
			println ("Verify New Order Page failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnOrderIdBtn() {
		try{
			action.Click(orderidbutton)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On Order Id Btn failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnNewItem() {

		try{
			action.Click(newitembtn)
			action.WaitForPageToLoad()
		}
		catch(Exception e) {
			println ("Click On New Item failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnFirstAddBtn() {
		try{
			action.Click(firstaddlink)
		}
		catch(Exception e) {
			println ("Click On First Add Btn failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySalesDivisionBtn() {

		try{
			boolean statusofvisibityofswitchsalesdivisionbtn = action.IsElementDisplayed(switchsalesdivision)
			Assert.assertTrue(statusofvisibityofswitchsalesdivisionbtn)
			boolean statusofenabilityofswitchsalesdivisionbtn = action.IsElementEnabled(switchsalesdivision)
			Assert.assertTrue(statusofenabilityofswitchsalesdivisionbtn)
		}
		catch(Exception e) {
			println ("Verify Sales division failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySwitchSalesDivisionBtn() {

		try{
			boolean  statusofvisibilityofswitchsalesdivisionbtn  =action.IsElementDisplayed(switchsalesdivision)
			Assert.assertTrue(statusofvisibilityofswitchsalesdivisionbtn)
			boolean  statusofenabilityofswitchsalesdivisionbtn  =action.IsElementDisplayed(switchsalesdivision)
			Assert.assertTrue(statusofenabilityofswitchsalesdivisionbtn)
		}
		catch(Exception e) {
			println ("Verify Switch Sales Division Btn failed due to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void SelectSalesDivision() {
		try{
			action.Click(switchsalesdivision)
			action.Click(selectsalesdivisionddn)
			action.Click(salesdivisionddnvalue)
		}
		catch(Exception e) {
			println ("Select Sales Division failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyAddnewCustomerBtn() {

		try{
			boolean statusofvisibityofaddnewcustomerbtn = action.IsElementDisplayed(addcustomerbtn)
			Assert.assertTrue(statusofvisibityofaddnewcustomerbtn)
			boolean statusofenabilityofnewcustomerbtn = action.IsElementEnabled(addcustomerbtn)
			Assert.assertTrue(statusofenabilityofnewcustomerbtn)
		}
		catch(Exception e) {
			println ("Verify Add new Customer Btn failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void AddNewCustomer() {
		try{
			action.ScrollToViewelement(addcustomerbtn)
			action.Click(addcustomerbtn)
			action.WaitTime(10)
			action.Type(customernametxtbx, "test")
			action.WaitTime(10)
			action.Click(customername)
			action.WaitTime(5)
		}
		catch(Exception e) {
			println ("Add New Customer failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyNewCustomerAddeddSuccessfully() {
		try{
			action.ScrollToTopOgPage()
			action.WaitVisible(addedcustomersuccessfuliymsg)
			boolean addedcustomerconfirmationmsg = action.IsElementDisplayed(addedcustomersuccessfuliymsg)
			Assert.assertTrue(addedcustomerconfirmationmsg)
		}
		catch(Exception e) {
			println ("Verify New Customer Addedd Successfully failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void AddDesiredShipDate() {
		try{
			action.Click(calanderdesireddatebtn)
			action.WaitTime(3)
			action.Click(desireddate)
			action.WaitTime(3)
		}
		catch(Exception e) {
			println ("Add Desired Ship Date failed due to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void AddShipMethod() {
		try{
			action.Click(shipmethodddn)
			action.WaitTime(5)
			action.Click(shipmethodddnvalue)
			action.WaitTime(5)
		}
		catch(Exception e) {
			println ("Add Ship Method failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifySubmitButton() {
		try{
			action.ScrollToBottomOfPage()
			action.WaitVisible(submitorder)
			boolean statusofsubmitodrerbtn = action.IsElementDisplayed(submitorder)
			Assert.assertTrue(statusofsubmitodrerbtn)
			boolean statusofenablesubmitodrerbtn = action.IsElementEnabled(submitorder)
			Assert.assertTrue(statusofenablesubmitodrerbtn)
		}
		catch(Exception e) {
			println ("Verify Submit Button failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickOnSubmitOrder() {

		try{
			action.Click(submitorder)
		}
		catch(Exception e) {
			println ("Click On Submit Order failed due to "+ e)
			Assert.fail()
		}
	}



	@Keyword
	public void VerifyOrderConfirmationMSg() {
		try{
			boolean orderconfirmationmsg = action.IsElementDisplayed(ordersuccessfullmsg)
			Assert.assertTrue(orderconfirmationmsg)
		}
		catch(Exception e) {
			println ("Verify Order Confirmation MSg failed ue to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyCancelButton() {
		try{
			boolean statusofpresenceofcancelorderbtn = action.IsElementDisplayed(cancelodrerbtn)
			Assert.assertTrue(statusofpresenceofcancelorderbtn)
			boolean statusofenabilityofcancelorderbtn = action.IsElementDisplayed(cancelodrerbtn)
			Assert.assertTrue(statusofenabilityofcancelorderbtn)
		}
		catch(Exception e) {
			println ("Verify Cancel Butto failed due to "+ e)
			Assert.fail()
		}
	}
}
