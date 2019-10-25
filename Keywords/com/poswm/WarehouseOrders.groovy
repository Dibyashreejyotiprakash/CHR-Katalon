package com.poswm

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.LocalDate

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
import java.time.LocalDate
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class WarehouseOrders {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By subMenuNewItem = By.xpath("//*[text()='New Item']")
	By subMenuNewOrder = By.xpath("//*[text()='New Order']")
	By werehouseSubMenuList = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']")
	By addordericon = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")
	By additembtn  = By.xpath("//*[@id='ctl00_MainContent_dockItemInformation_C_btnImgItemSearch']")
	By firstaddtextbox = By.xpath("//*[@id='ctl00_MainContent_RadDock2_C_rgItemSearch']//tr[1]/td[10]//div/span/input[1]")
	By addlinkforfirstitem = By.xpath("//*[@id='ctl00_MainContent_RadDock2_C_rgItemSearch']//tr[1]/td[10]/a[text()='Add']")
	By addcustomerbtn = By.xpath("//*[text()='Add Customer']")
	By customertextbox = By.xpath("//*[@id='ctl00_MainContent_dockCustomerInformation_C_rsbCustomers_Input']")
	By iteminfobar = By.xpath("//*[@id='ctl00_MainContent_dockItemInformation_T']")
	By customername = By.xpath("//*[@id='rsbCustomerName']")
	By customeraddedmsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By desiredshipdatetextbox = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_calShipDate_dateInput']")
	By desiredshipdateaddedmsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By shippingmethodddn = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_ddlShippingMethod_Arrow']")
	By shipingmethodddnvalue = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_ddlShippingMethod_DropDown']//li[1]")
	By shipingmethodaddedmsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By submitbtn = By.xpath("//*[@id='ctl00_MainContent_btnSubmitOrder_input']")
	By cancelbtn = By.xpath("//*[@id='ctl00_MainContent_btnCancelOrder_input']")
	By submitordermsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By errormsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By cancelationmsg = By.xpath("//*[@id='ctl00_MainContent_radNotifyMessage_simpleContentDiv']")
	By plusIcon = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")
	By itemNameColumn = By.xpath("//*[@id='ctl00_MainContent_dockItemInformation_C_rgOrderItems_ctl00_ctl04_lblItemName']")
	By EditThisItem = By.xpath("//*[@id='MainContent_btnEditItemWizard']")
	By imageNextBtn = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i1_i0_ucItemImage_btnNext']")
	By brandNextBtn = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i2_i0_ucItemBrands_btnNext']")
	By ItemInfonextButton = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnNext']")
	By salesDivisionThirdOption = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_DropDown']/div/ul/li[2]")
	By salesDivisionDropDown = By.xpath("//*[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_radSalesDivision_Input']")
	By itemInfoSaveIcon = By.xpath("//input[@id='ctl00_MainContent_radWizardBar_i0_i0_ucItemCreate_btnUpdate']")
	By desiredshipdatetextbox = By.xpath("//*[@id='ctl00_MainContent_dockShippingInformation_C_calShipDate_dateInput']")

	
	By addBtn = By.xpath("(//*[text()='Add'])[1]")
	By addCustomer = By.xpath("(//*[text()='Add Customer'])[1]")
	By addanItemLink = By.xpath("(//*[text()='Add an Item'])[1]")



	
	@Keyword
	public void ClickOnAddanItemIcon()
	{
		try
		{
			action.Click(plusIcon)
			WebUI.delay(10)
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnAddanItemLink method failed due to :" + e)
		}
	}
	
	
	@Keyword
	public void ClickOnAddanItemLink()
	{
		try
		{
			action.Click(addanItemLink)
			WebUI.delay(10)
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnAddanItemLink method failed due to :" + e)
		}
	}
	
	@Keyword
	public void ClickOnAddLink()
	{
		try
		{
			action.Click(addBtn)
			WebUI.delay(10)
			
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnAddLink method failed due to :" + e)
		}
	}

	@Keyword
	public void VerifyNewOrderPage() {
	  try{
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseItem.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseItem.aspx"
		String expectedPRODUrl = "https://csg.v5prod.brandmuscle.net/Warehouse/WarehouseItem.aspx";

		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL();
		WebUI.delay(5)

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("staging")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
	  }
	catch(Exception e) {
			Assert.fail("Verify New Order page failed due to "+ e)
	  }
	}

	@Keyword
	public void VerifyAndClickOnAddOrderIcon() {
		try{
			boolean statusofaddordericon = action.IsElementDisplayed(additembtn)
			Assert.assertTrue(statusofaddordericon)
			if(statusofaddordericon == true) {
				action.Click(addordericon)
			}
			else {
				throw new Exception("Add New Order Icon is not present")
			}
		}
		catch(Exception e) {
			Assert.fail("Click On Add Order Icon failed due to "+ e)
		}
	}

	@Keyword
	public String GetOrderId() {
		String orderid = null
		try{
			orderid = driver.findElement(By.id("ctl00_MainContent_RadDock1_C_tbOrderID")).getAttribute("value")
			println ("Order id is ---------------"+ orderid)
			return orderid
		}

		catch(Exception e) {
			Assert.fail("Get Order Id failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyAddItemLink() {
		try{
			boolean statusofaddanitemlink = action.IsElementEnabled(additembtn)
			Assert.assertTrue(statusofaddanitemlink)
		}
		catch(Exception e){
			Assert.fail("Verify Add Item Link failed due to "+ e)
		}
	}

	@Keyword
	public void AddItemAndVerifyMsg() {
		try{
			action.Click(additembtn)
			action.WaitForPageToLoad()
			action.Type(firstaddtextbox, "10")
			action.Click(addlinkforfirstitem)
			action.ScrollToTopOgPage()
			boolean statusofiteminfobar = action.IsElementDisplayed(iteminfobar)
			Assert.assertTrue(statusofiteminfobar)
		}
		catch(Exception e) {
			Assert.fail("Add Item failed due to "+ e)
		}
	}

	@Keyword
	public void AddCustomerAndVerifyMsg() {
		try{
			action.ScrollToViewelement(addcustomerbtn)
			action.WaitUntilElementClickable(addcustomerbtn)
			action.Click(addcustomerbtn)
			WebUI.delay(10)
			action.Type(customertextbox, "st")
			action.Click(customername)
			action.ScrollToTopOgPage()
			boolean statusofcustomeraddedmessage = action.IsElementDisplayed(customeraddedmsg)
			Assert.assertTrue(statusofcustomeraddedmessage)
		}
		catch(Exception e) {
			Assert.fail("Add Customer and verify failed due to "+ e)
		}
	}

	@Keyword
	public void AddDesiredShippingDateAndVerifyMsg() {
		try{
			action.ScrollToViewelement(desiredshipdatetextbox)
			LocalDate date = new LocalDate()
			String todaydate = date.now()
			action.Type(desiredshipdatetextbox, todaydate)
			action.ScrollToTopOgPage()
			boolean statusofaddedshimethodmsg = action.IsElementDisplayed(desiredshipdateaddedmsg)
			Assert.assertTrue(statusofaddedshimethodmsg)
		}
		catch(Exception e) {
			Assert.fail("Add Desired Shipping Date and verify failed due to "+ e)
		}
	}

	@Keyword
	public void AddShipingMethodAndVerifyMsg() {
		try{
			action.ScrollToViewelement(shippingmethodddn)
			action.WaitUntilElementClickable(shippingmethodddn)
			WebUI.delay(10)
			action.Click(shippingmethodddn)
			WebUI.delay(10)
			action.Click(shipingmethodddnvalue)
			action.ScrollToTopOgPage()
			boolean statusofshipingmethodaddedmsg = action.IsElementDisplayed(shipingmethodaddedmsg)
			Assert.assertTrue(statusofshipingmethodaddedmsg)
		}
		catch(Exception e) {
			Assert.fail("Add Desired Shipping Method and verify failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnSubmitOrderBtnAndevrifyMsg() {
		try{
			action.ScrollToViewelement(submitbtn)
			action.Click(submitbtn)
			action.ScrollToTopOgPage()
			boolean statusofsubmitordermsg = action.IsElementDisplayed(submitordermsg)
			Assert.assertTrue(statusofsubmitordermsg)
		}
		catch(Exception e) {
			Assert.fail("Add Desired Shipping Method and verify failed due to "+ e)
		}
	}

	@Keyword
	public void VerifySubmitBtn() {
		try{
			action.ScrollToBottomOfPage()
			boolean statusofsubmitorderbtn = action.IsElementEnabled(submitbtn)
			Assert.assertTrue(statusofsubmitorderbtn)
		}
		catch(Exception e) {
			Assert.fail("Verify Submit Btn failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyerrorMsgWithoutAddingOrderDetails() {
		try{
			action.ScrollToBottomOfPage()
			boolean statusofsubmitorderbtn = action.IsElementEnabled(submitbtn)
			Assert.assertTrue(statusofsubmitorderbtn)
			if(statusofsubmitorderbtn == true) {
				action.Click(submitbtn)
				action.ScrollToTopOgPage()
				boolean statusoferrormsg = action.IsElementDisplayed(errormsg)
				Assert.assertTrue(statusoferrormsg)
			}
		}
		catch(Exception e) {
			Assert.fail("Verify error Msg Without Adding Order Details failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyCancelBtn() {

		try{
			action.ScrollToBottomOfPage()
			boolean statusofcancelbtn = action.IsElementEnabled(cancelbtn)
			Assert.assertTrue(statusofcancelbtn)
		}
		catch(Exception e) {
			Assert.fail("Verify Cancel Btn failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnCancelBtnAndVerifyMsg() {
		try {
			action.Click(cancelbtn)
			WebUI.delay(10)
			action.AcceptAlert()
			boolean statusofcancelationmsg = action.IsElementDisplayed(cancelationmsg)
			Assert.assertTrue(statusofcancelationmsg)
		}
		catch(Exception e) {
			Assert.fail("Click On Cancel Btn failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnItemName() {
		try {
			action.Click(itemNameColumn)
			WebUI.delay(5)	
		}
		catch(Exception e) {
			Assert.fail("ClickOnItemName method failed due to :"+e)
		}
	}

	@Keyword
	public void ClickOnEditThisItem() {
		try {
			action.WindowHandle()
			WebUI.delay(3)
			action.Click(EditThisItem)
			action.WaitForPageToLoad()
			WebUI.delay(3)
			action.Click(salesDivisionDropDown)
			action.WaitTime(3)
			action.Click(salesDivisionThirdOption)
			action.Click(itemInfoSaveIcon)
			WebUI.delay(5)
			action.Click(ItemInfonextButton)
			WebUI.delay(2)
			action.Click(imageNextBtn)
			WebUI.delay(2)
			action.Click(brandNextBtn)
		}
		catch(Exception e) {
			Assert.fail("ClickOnEditThisItem method failed due to :"+e)
		}
	}



	@Keyword
	public void AddDesiredShipDate() {
		try{
			action.ScrollToViewelement(desiredshipdatetextbox)
			LocalDate date = new LocalDate()
			String todaydate = date.now()
			action.Type(desiredshipdatetextbox, todaydate)
		}
		catch(Exception e) {
			Assert.fail("Add Desired Shipping Date and verify failed due to "+ e)
		}
	}
}
