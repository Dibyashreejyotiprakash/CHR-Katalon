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
	public void VerifyNewItemPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseItem.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseItem.aspx"
		String expectedPRODUrl = "https://csg.v5prod.brandmuscle.net/Warehouse/WarehouseItem.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL();

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("stage")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("prod")) {
			Assert.assertEquals(expectedPRODUrl, actualUrl)
		}
		else {
			println (Assert.fail());
		}
	}

	@Keyword
	public void VerifyNewOrderPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		String expectedPRODUrl = "https://csg.v5prod.brandmuscle.net/Warehouse/WarehouseOrders.aspx";

		action.MouseHoverOnElement(menuWarehouse)
		action.WaitVisible(werehouseSubMenuList)
		action.WaitTime(2)

		action.Click(subMenuNewOrder)
		action.WaitForPageToLoad()
		action.WaitVisible(plusIcon)

		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL();

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("stage")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("prod")) {
			Assert.assertEquals(expectedPRODUrl, actualUrl)
		}
		else {
			println (Assert.fail());
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
