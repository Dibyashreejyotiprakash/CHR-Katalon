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

public class Homepage {

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
	By subMenuitemProperties = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[1]")
	By lavelItemProperty = By.xpath("//*[text()='Item Properties']")
	By menuWarehouse = By.xpath("//*[@id='mainMenu']/div/ul/li[2]/a/span")
	By subMenuWareHouse = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[2]")
	By subMenuWarehouseUsers = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[3]")
	By subMenuWarehouseSpendLimits = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[4]")
	By subMenuWelcomeMessage = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[5]")
	By subMenuUserItemApprovalTransfer = By.xpath("//*[text()='User Item Approval Transfer']")
	By subMenuMenuLinkBrand = By.xpath("//*[text()='MenuLink_Brand']")
	By labelWareHouseAdmin = By.xpath("//*[@id='MainContent_pnlSites']")
	By linkAddNewUser = By.xpath("//*[@id='ctl00_MainContent_rdGridWarehouseUsers_ctl00_ctl02_ctl00_InitInsertButton']")
	By linkAddNewCompliance = By.xpath("//*[@id='ctl00_MainContent_rgExistingBudgets_ctl00_ctl02_ctl00_InitInsertButton']")
	By btnSaveDashBoardMessage = By.xpath("//*[@id='MainContent_MainContent_btnSubmit']")
	By labelTransferFrom = By.xpath("//*[@id='MainContent_lblApproverUser']")
	By menuChangePassword = By.xpath("//*[text()='Change Password']")
	By levelChangePassword = By.xpath("//*[@id='MainContent_lblChangePassword']")
	By posWarehouseReport = By.xpath("//*[@id='lbReport']")
	By helpSupportBtn = By.xpath("//*[text()='Help/Support']")




	By logoutlink = By.xpath("//*[text()='Logout']")

	@Keyword
	public void PosLogout() {
		action.Click(logoutlink)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void HoverOnWareHouseMenu() {
		action.MouseHoverOnElement(menuWarehouse);
		action.WaitTime(3);
	}


	@Keyword
	public void ClickOnReports() {
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(reports)
		action.WaitForPageToLoad()
		action.WaitTime(5);
	}




	@Keyword
	public void ClickOnItemSearch() {
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(itemsearchbtn)
		action.WaitForPageToLoad()
		action.WaitTime(5);
	}

	@Keyword
	public void ClickOnNewItem() {
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(newitembtn)
		action.WaitForPageToLoad()
		action.WaitTime(3)
	}

	@Keyword
	public void ClickOnNewOrder() {
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(neworderbtn)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClicOnOrderSearch() {
		action.WaitVisible(warehousebtn)
		action.MouseHoverOnElement(warehousebtn)
		action.MouseHoverAndClick(ordersearchbtn)
		action.WaitForPageToLoad()
	}


	@Keyword
	public void ClickOnItemProperties() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuitemProperties)
		action.Click(subMenuitemProperties)
		action.WaitVisible(lavelItemProperty)
	}

	@Keyword
	public void ClickOnWarehouse() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuWareHouse)
		action.Click(subMenuWareHouse)
		action.WaitForPageToLoad();
		action.WaitVisible(labelWareHouseAdmin)
	}

	@Keyword
	public void ClickOnWarehouseUser() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuWarehouseUsers)
		action.Click(subMenuWarehouseUsers)
		action.WaitForPageToLoad();
		action.WaitVisible(linkAddNewUser)
	}

	@Keyword
	public void ClickOnWarehouseSpendLimits() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuWarehouseSpendLimits)
		action.Click(subMenuWarehouseSpendLimits)
		action.WaitForPageToLoad();
		action.WaitVisible(linkAddNewCompliance)
	}
	@Keyword
	public void ClickOnWelcomeMessage() {
		action.MouseHoverOnElement(adminbtn)
		//action.WaitVisible(subMenuWelcomeMessage)
		action.Click(welcomemsg)
		action.WaitForPageToLoad();
		//action.WaitVisible(btnSaveDashBoardMessage)
	}
	@Keyword
	public void ClickOnUserItemApprovalTransfer() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuUserItemApprovalTransfer)
		action.Click(subMenuUserItemApprovalTransfer)
		action.WaitForPageToLoad();
		action.WaitVisible(labelTransferFrom)
	}

	@Keyword
	public void ClickOnMenuLinkBrand() {
		action.MouseHoverOnElement(adminbtn)
		action.WaitVisible(subMenuMenuLinkBrand)
		action.Click(subMenuMenuLinkBrand)
		action.WaitForPageToLoad();
		action.WaitTime(5)
	}

	@Keyword
	public void ClickOnChangePasswordMenu() {
		action.Click(menuChangePassword)
		action.WaitForPageToLoad();
		action.WaitVisible(levelChangePassword)
		action.WaitTime(5)
	}

	@Keyword
	public void VerifyHelpSupport(){
		boolean statusHelpSupportBtn = action.IsElementEnabled(helpSupportBtn)
		Assert.assertTrue(statusHelpSupportBtn)
		println ("Help/Support button is enable")
	}
}
