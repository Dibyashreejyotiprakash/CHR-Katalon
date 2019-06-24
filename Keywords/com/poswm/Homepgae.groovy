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
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.Alert
import org.openqa.selenium.By
import com.kms.katalon.core.webui.driver.DriverFactory

public class Homepgae {
	
	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()
	
	By homebtn = By.xpath("//*[text()='Home']")
	By ordersearchtxfield = By.id("ctl00_MainContent_rdOrderSearch_C_ucQuickOrderSearch_txtOrderID")
	By warehousebtn = By.xpath("(//*[text()='Warehouse'])[1]")
	By itemsearchbtn = By.xpath("//*[text()='Item Search']")
	By newitembtn = By.xpath("//*[text()='New Item']")
	By neworderbtn = By.xpath("//*[text()='New Order']")
	By ordersearchbtn = By.xpath("//*[text()='Order Search']")
	By adminbtn = By.xpath("//*[text()='Administration']")
	By itempropertiesbtn = By.xpath("//*[text()='Item Properties']")
	By spendlimits = By.xpath("//*[text()='Warehouse Spend-Limits']")
	By welcomemsg = By.xpath("//*[text()='Welcome Message']")
	By warehouse = By.xpath("//*[text()='Warehouse']")
	By warehouseusers = By.xpath("//*[text()='Warehouse Users']")
	By reports = By.xpath("//*[text()='Reports']")
	By helpandsupport = By.xpath("//*[text()='Help/Support']")
	By firstvieworder = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00__0']/td[2]/a")
    By removeitem = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00__0']/td[3]/a")	
	By cancelorder = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00__0']/td[4]/a")
	By pendingshipmentshiporder = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_C_rgPendingShipment_ctl00']//tr[1]/td[3]")
	
	
	@Keyword
	public void ClickOnItemSearch()
	{
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(itemsearchbtn)
		action.WaitForPageToLoad()
	}
	
	@Keyword
	public void ClickOnNewItem()
	{
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(newitembtn)
		action.WaitForPageToLoad()
	}
	
	@Keyword
	public void ClickOnNewOrder()
	{
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(neworderbtn)
		action.WaitForPageToLoad()
	}
	
	@Keyword
	public void ClicOnOrderSearch()
	{
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(ordersearchbtn)
		action.WaitForPageToLoad()
	}
	
	
	
	
}
