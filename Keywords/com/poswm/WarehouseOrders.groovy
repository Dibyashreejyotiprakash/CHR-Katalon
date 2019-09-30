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

public class WarehouseOrders {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()


	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By subMenuNewItem = By.xpath("//*[text()='New Item']")
	By subMenuNewOrder = By.xpath("//*[text()='New Order']")
	By werehouseSubMenuList = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']")
	By plusIcon = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")




	@Keyword
	public void VerifyNewItemPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseItem.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseItem.aspx"
		String expectedPRODUrl = "https://csg.v5prod.brandmuscle.net/Warehouse/WarehouseItem.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL();
		//WebUI.delay(5)

		if(env.equalsIgnoreCase("uat")) {
			Assert.assertEquals(expectedUATUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("staging")) {
			Assert.assertEquals(expectedSTAGEUrl, actualUrl)
		}
		else if(env.equalsIgnoreCase("prod")) {
			Assert.assertEquals(expectedPRODUrl, actualUrl)
		}
		else {

			println ("ÜRL is not matching");
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyNewOrderPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		String expectedPRODUrl = "https://csg.v5prod.brandmuscle.net/Warehouse/WarehouseOrders.aspx";

		action.MouseHoverOnElement(menuWarehouse)
		action.WaitVisible(werehouseSubMenuList)
		//action.WaitTime(2)

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
}
