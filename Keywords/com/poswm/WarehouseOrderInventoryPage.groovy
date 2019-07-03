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


public class WarehouseOrderInventoryPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()

	By addnewitembtn = By.cssSelector(".RadMenu_Office2010Silver .rmFirst .rmText")
	By supplierfiletr = By.xpath("")
	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By subMenuNewItem = By.xpath("//*[text()='New Item']")
	By itemInformationDivision = By.xpath("//*[@id='ctl00_MainContent_radWizardBar']")
	By subMenuItemSearch = By.xpath("//*[text()='Item Search']")
	By subMenuNewOrder = By.xpath("//*[text()='New Order']")
	//By subMenuOrderSearch = By.xpath("//*[text()='Order Search']")
	By subMenuOrderSearch = By.xpath("//*[text()='Order Search']")
	By subMenuAdministration = By.xpath("//*[text()='Administration']")
	By subMenuReports = By.xpath("//*[text()='Reports']")
	By werehouseSubMenuList = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']")
	By divAddNewItem = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']")













	@Keyword
	public void VerifyOrderInventoryPage() {
		action.WaitVisible(addnewitembtn)
		boolean statusofaddnewitembtn = action.IsElementDisplayed(addnewitembtn)
		Assert.assertTrue(statusofaddnewitembtn)
		boolean statusofenablecreateneworderbtn = action.IsElementEnabled(addnewitembtn)
		Assert.assertTrue(statusofenablecreateneworderbtn)
	}

	@Keyword
	public void VerifyItemSearchPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseItemInventory.aspx" ;
		String expectedSTAGEUrl = "https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseItemInventory.aspx" ;
		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseItemInventory.aspx" ;

		action.MouseHoverOnElement(menuWarehouse)
		action.WaitVisible(werehouseSubMenuList)
		action.WaitTime(2)

		action.Click(subMenuItemSearch)
		action.WaitForPageToLoad()
		action.WaitVisible(divAddNewItem)

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
		else
		{
			Assert.fail();
		}
	}

	@Keyword
	public void SelectMenuAndSubMenu(String Menuname , String SubMenuName)
	{
		if(Menuname.equalsIgnoreCase("warehouse")
		{

			action.MouseHoverOnElement(menuWarehouse)
			action.WaitVisible(werehouseSubMenuList)
			action.WaitTime(2)

			if(SubMenuName.equalsIgnoreCase("Item Search")
			{
				action.Click(subMenuItemSearch)
				action.WaitForPageToLoad()
				action.WaitVisible(divAddNewItem)

			}

		}

	}




























}
