



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

public class Homepage
 {

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
	By subMenuitemProperties = By.xpath("//*[text()='Item Properties']")
	By lavelItemProperty = By.xpath("//*[@id='MainContent_lblTypes']")
	By menuWarehouse = By.xpath("(//*[text()='Warehouse'])[1]")
	By subMenuWareHouse = By.xpath("(//*[text()='Warehouse'])[2]")
	By subMenuWarehouseUsers = By.xpath("//*[text()='Warehouse Users']")
	By subMenuWarehouseSpendLimits = By.xpath("//*[@class='rmVertical rmGroup rmLevel1 menu']/li[5]//following-sibling::div/ul/li[4]")
	By subMenuWelcomeMessage = By.xpath("//*[text()='Welcome Message']")
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
	By btnClear = By.xpath("//*[text()='Clear']")
	By firstItem = By.xpath("//*[@id='ctl00_MainContent_rgItemSearch_GridData']/table/tbody/tr[1]/td[11]/a")
	By btnEditThisItem = By.xpath("//*[@id='MainContent_btnEditItemWizard']")
	By itemInformationSection = By.xpath("//*[text()='Step 1: Item Information']")
	By logoutlink = By.xpath("//*[text()='Logout']")
	By homeMenu = By.xpath("//*[text()='Home']")
	By approveDateCol = By.xpath("//*[text()='Approved Date']")



	@Keyword
	public void PosLogout() {
		action.Click(logoutlink)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void HoverOnWareHouseMenu() {
		action.MouseHoverOnElement(menuWarehouse);
		//action.WaitTime(3);
	}


	@Keyword
	public void ClickOnReports() {
		action.MouseHoverOnElement(menuWarehouse)
		WebUI.delay(5)
		action.Click(reports)
		action.WaitForPageToLoad()
	}


	@Keyword
	public NaviagteToDashBoard() {
		action.Click(homeMenu)
		WebUI.delay(5)
	}

	@Keyword
	public void VerifyApproveDateColumn() {
		try {
			//boolean IsColumnVerified =false
			boolean status =  action.IsElementDisplayed(approveDateCol)
			Assert.assertTrue(status)
			println "column verified successfully"
		}
		catch(Exception e) {
			Assert.fail("VerifyApproveDateColumn method failed due to :" + e)
		}
	}


	@Keyword
	public void ClickOnItemSearch() {
		action.MouseHoverOnElement(menuWarehouse)
		//WebUI.delay(3)
		action.Click(itemsearchbtn)
		//action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnNewItem() {
		action.MouseHoverOnElement(menuWarehouse)
		WebUI.delay(3)
		action.Click(newitembtn)
		//action.WaitForPageToLoad()
		action.WaitVisible(itemInformationSection)
		WebUI.delay(3)
	}

	@Keyword
	public void ClickOnNewOrder() {
		action.MouseHoverOnElement(menuWarehouse)
		action.Click(neworderbtn)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClicOnOrderSearch() {
		action.MouseHoverOnElement(menuWarehouse)
		action.Click(ordersearchbtn)
		action.WaitForPageToLoad()
	}


	@Keyword
	public void ClickOnItemProperties() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuitemProperties)
		//action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnWarehouse() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuWareHouse)
		//action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnWarehouseUser() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuWarehouseUsers)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnWarehouseSpendLimits() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuWarehouseSpendLimits)
		action.WaitForPageToLoad();
	}

	@Keyword
	public void ClickOnWelcomeMessage() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuWelcomeMessage)
		action.WaitForPageToLoad()
	}
	@Keyword
	public void ClickOnUserItemApprovalTransfer() {
		action.MouseHoverOnElement(menuWarehouse)
		action.MouseHoverOnElement(adminbtn)
		action.Click(subMenuUserItemApprovalTransfer)
		action.WaitForPageToLoad()
	}

	@Keyword
	public void ClickOnMenuLinkBrand() {
		action.MouseHoverOnElement(menuWarehouse)
		WebUI.delay(3)
		action.MouseHoverOnElement(adminbtn)
		WebUI.delay(3)
		action.Click(subMenuMenuLinkBrand)
		WebUI.delay(3)
		action.WaitForPageToLoad()
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



	@Keyword
	public void SelectFirstItem(){
		try{
			String ItemName = action.GetText(firstItem)
			println "Item Name " + ItemName
			action.Click(firstItem)
			WebUI.delay(5)
			action.WindowHandle()
			WebUI.delay(7)
			action.Click(btnEditThisItem)
		}
		catch(Exception e){

			println ("SelectFirstItem method failed due to : "+ e)
		}
	}
}
