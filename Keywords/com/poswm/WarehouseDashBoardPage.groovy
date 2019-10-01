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



public class WarehouseDashBoardPage {

	Interaction action = new Interaction();
	WebDriver driver = DriverFactory.getWebDriver()



	By downloadDivisionForDraftOrder = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']")
	By OrderInventoryCreateNewBtn = By.xpath("//*[@id='ctl00_MainContent_rmItemCommands']")
	By wareHouseOrder = By.xpath("//*[text()='Warehouse Order']")
	By warehouseOrderInventory = By.xpath("//*[text()='Warehouse Order Inventory']")

	By draftOrder = By.xpath("//*[text()='Draft Orders']")
	By completedOrder = By.xpath("//*[text()='Completed Orders']")
	By warehouseItem = By.xpath("//*[text()='Warehouse Item']")
	By warehouseItemInventory = By.xpath("//*[text()='Warehouse Item Inventory']")
	By itemPackList = By.xpath("//*[text()='Item Pick List']")
	By orderPackList = By.xpath("//*[text()='Order Pack List']")
	By reportBatches = By.xpath("//*[text()='Report Batches']")
	By userGuide = By.xpath("//*[text()='User Guide']")
	By plusIcon = By.xpath("//*[@id='ctl00_MainContent_RadDock1_C_btnNewOrder']")
	By ItemInfoDiv = By.xpath("//*[text()='Step 1: Item Information']")


	By pendingApprovalOrdersDiv = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_T']")
	By pendinApprovalExpandBtn = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_T']/ul/li/a/span")

	By pendingShipmentOrdersDiv = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment']/table/tbody/tr[1]")
	//By pendingShipmentOrdersDiv = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_T']")
	By pendinShipmentExpandBtn = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_T']/ul/li/a/span")

	By myDraftOrdersDiv = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_T']")
	By myDraftOrdersExpandBtn = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_T']/ul/li/a/span")
	By myOrdersDiv = By.xpath("//*[@id='ctl00_MainContent_rdMyOrders_T']")
	By myOrdersExpandBtn = By.xpath("//*[@id='ctl00_MainContent_rdMyOrders_T']/ul/li/a/span")
	By tblpendinApproval = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00']")
	By firstRowCheckBox = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00_ctl04_colCheckedSelectCheckBox']")
	By viewOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00']//following-sibling::tbody/tr[1]/td[2]/a")
	By removeItemLink = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00']//following-sibling::tbody/tr[1]/td[3]/a")
	By cancelOrder = By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00']//following-sibling::tbody/tr[1]/td[4]/a")
	By pendinAppFirstRow= By.xpath("//*[@id='ctl00_MainContent_rdPendingApproval_C_rgPendingApprovalByItem_ctl00']//following-sibling::tbody/tr[1]")




	By FirstRowpendingShipmentOrders = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_C_rgPendingShipment_ctl00']//following-sibling::tbody/tr[1]")
	By pendinShipmentViewOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_C_rgPendingShipment_ctl00']//following-sibling::tbody/tr[1]/td[2]")
	By pendingShipmentShipOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_C_rgPendingShipment_ctl00']//following-sibling::tbody/tr[1]/td[3]")
	By pendingShipmentCancelOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdPendingShipment_C_rgPendingShipment_ctl00']//following-sibling::tbody/tr[1]/td[4]")


	By MyDraftOrdersDivision = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_T']")
	By myDraftOrderFirstRow = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_C_rgDraftOrders_ctl00']//following-sibling::tbody/tr[1]")
	By myDraftOrderViewOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_C_rgDraftOrders_ctl00']//following-sibling::tbody/tr[1]/td[1]")
	By myDraftOrderCancelOrderLink = By.xpath("//*[@id='ctl00_MainContent_rdDraftOrders_C_rgDraftOrders_ctl00']//following-sibling::tbody/tr[1]/td[2]")



	By myOrderDivision = By.xpath("//*[@id='ctl00_MainContent_rdMyOrders_T']")
	By myOrderFirstRow = By.xpath(" //*[@id='ctl00_MainContent_rdMyOrders_C_rgMyOrders_ctl00']//following-sibling::tbody/tr[1]")
	By myOrderViewOrderLink = By.xpath(" //*[@id='ctl00_MainContent_rdMyOrders_C_rgMyOrders_ctl00']//following-sibling::tbody/tr[1]/td[1]")
	By myOrderCancelOrderLink = By.xpath(" //*[@id='ctl00_MainContent_rdMyOrders_C_rgMyOrders_ctl00']//following-sibling::tbody/tr[1]/td[2]")
	By OrderPcakListLink = By.xpath("//*[text()='Order Pack List']")
	By PrintIcon = By.xpath("//*[@name='ctl00$MainContent$tlrkReportViewer$ReportToolbar$PrintGr$Print$ctl00']")
	By warehouse = By.xpath("//*[text()='Warehouse']")
	By newitem = By.xpath("//*[text()='New Item']")
	By neworder = By.xpath("//*[text()='New Order']")
	By ordersearch = By.xpath("//*[text()='Order Search']")
	By admin = By.xpath("//*[text()='Administration']")
	By useritemapprovaltransfer = By.xpath("//*[text()='User Item Approval Transfer']")
	By warehouseusers = By.xpath("//*[text()='Warehouse Users']")
	
	@Keyword
	public void ClickOnNewItem()
	{
		try{
			action.MouseHoverOnElement(warehouse)
			action.WaitVisible(newitem)
			action.Click(newitem)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Click on new item failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnNewOrder()
	{
		try
		{
			action.MouseHoverOnElement(warehouse)
			action.WaitVisible(neworder)
			action.Click(neworder)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Click on new order failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnOrderSearch()
	{
		try{
			action.MouseHoverOnElement(warehouse)
			action.WaitVisible(ordersearch)
			action.Click(ordersearch)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Click On Order Search failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyMyOrdersDivision(){


		try{
			action.WaitTime(2)
			boolean statusPendinShipDiv = action.IsElementDisplayed(myOrderDivision)
			if(statusPendinShipDiv == true) {
				action.ScrollToViewElement(myOrderDivision)
				if(action.IsElementDisplayed(myOrderFirstRow)){
					boolean statusmyOrderViewOrderLink = action.IsElementEnabled(myOrderViewOrderLink)
					boolean statusmyOrderCancelOrderLink = action.IsElementEnabled(myOrderCancelOrderLink)

					Assert.assertTrue(statusmyOrderViewOrderLink)
					println("View Order link is enable")
					Assert.assertTrue(statusmyOrderCancelOrderLink)
					println("Cancel Order link is enable")
				}
			}
			else{
				throw new Exception("My order div is disbaled")
			}
		}
		catch(Exception e)
		{
			println ("Verify My Orders Division failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyMyDraftOrdersDivision(){
		try{
			action.WaitTime(2)
			boolean statusPendinShipDiv = action.IsElementDisplayed(MyDraftOrdersDivision)
			if(statusPendinShipDiv == true) {
				action.ScrollToViewElement(MyDraftOrdersDivision)
				if(action.IsElementDisplayed(myDraftOrderFirstRow)){
					boolean statusmyDraftOrderViewOrderLink = action.IsElementEnabled(myDraftOrderViewOrderLink)
					boolean statusmyDraftOrderCancelOrderLink = action.IsElementEnabled(myDraftOrderCancelOrderLink)

					Assert.assertTrue(statusmyDraftOrderViewOrderLink)
					println("View Order link is enable")
					Assert.assertTrue(statusmyDraftOrderCancelOrderLink)
					println("Cancel Order link is enable")
				}
				else{
					throw new Exception ("My draft order div is disbaled")
				}
			}
		}
		catch(Exception e)
		{
			println ("Verify My Draft Orders Division failed ue to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyPendingShipmentOrdersDivision(){
		try{
			action.WaitTime(2)
			boolean statusPendinShipDiv = action.IsElementDisplayed(pendingShipmentOrdersDiv)
			if(statusPendinShipDiv == true) {
				action.ScrollToViewElement(pendingShipmentOrdersDiv)
				if(action.IsElementDisplayed(FirstRowpendingShipmentOrders)){
					boolean statusViewOrder = action.IsElementEnabled(pendinShipmentViewOrderLink)
					boolean statusShipOrder = action.IsElementEnabled(pendingShipmentShipOrderLink)
					boolean statusCancelOrder = action.IsElementEnabled(pendingShipmentCancelOrderLink)

					Assert.assertTrue(statusViewOrder)
					println("View Order link is enable")
					Assert.assertTrue(statusShipOrder)
					println("Ship Order link is enable")
					Assert.assertTrue(statusCancelOrder)
					println("Cancel Order link is enable")
					//action.Click(pendinApprovalExpandBtn)
				}
				else{
					throw new Exception ("Pending shipment ordre div disabled")
				}

			}
		}
		catch(Exception e)
		{
			println ("Verify Pending Shipment Orders Division failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void VerifyPendingApprovalOrdersDivision(){
		try{
			boolean statusPendinAppDiv = action.IsElementDisplayed(pendingApprovalOrdersDiv)
			if(statusPendinAppDiv == true) {
				//action.Click(pendinApprovalExpandBtn)
				if(action.IsElementDisplayed(pendinAppFirstRow)){
					boolean statusCheckBox = action.IsElementEnabled(firstRowCheckBox)
					boolean statusViewOrder = action.IsElementEnabled(viewOrderLink)
					boolean removeItemLink = action.IsElementEnabled(removeItemLink)
					boolean cancelOrder = action.IsElementEnabled(cancelOrder)

					Assert.assertTrue(statusCheckBox)
					println("Check Box is enable")
					Assert.assertTrue(statusViewOrder)
					println("View Order link is enable")
					Assert.assertTrue(removeItemLink)
					println("Remove Item link is enable")
					Assert.assertTrue(cancelOrder)
					println("Cancel Order link is enable")
					action.Click(pendinApprovalExpandBtn)
				}
			}
			else{
				throw new Exception ("Pending approval order div is disabled")
			}
		}
		catch(Exception e)
		{
			println ("Verify Pending Approval Orders Division failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ClickAndVerifyWareHouseOrderLink() {
		try{
			action.WaitVisible(wareHouseOrder)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(wareHouseOrder)
			if(statuswareHouseOrderLink == true){
				action.Click(wareHouseOrder)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("WarehouseOrders.aspx")
			}
			else{
				throw new Exception("Ware house order link is disabled")
			}
		}
		catch(Exception e)
		{
			println ("Click And Verify Ware House Order Link failed due to "+ e)
			Assert.fail()
		}
	}


	@Keyword
	public void ClickAndVerifyWareHouseOrderInventoryLink() {
		try{
			action.WaitVisible(warehouseOrderInventory)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(warehouseOrderInventory)
			if(statuswareHouseOrderLink == true){
				action.Click(warehouseOrderInventory)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("WarehouseOrderInventory.aspx")
			}
			else{
				throw new Exception ("Ware House Inventory link is disabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify WareHouse Order Inventory Link failed due to "+ e)
		}
	}

	@Keyword
	public void ClickAndVerifyDraftOrdersLink() {
		try{
			action.WaitVisible(draftOrder)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(draftOrder)
			if(statuswareHouseOrderLink == true){
				action.Click(draftOrder)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("WarehouseOrderInventory.aspx?status=Created")
			}
			else{
				throw new Exception ("Draft order link disabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify Draft Orders Link failed due to "+ e)
		}
	}


	@Keyword
	public void ClickAndVerifyCompletedOrdersLink() {
		try{
			action.WaitVisible(completedOrder)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(completedOrder)
			if(statuswareHouseOrderLink == true){
				action.Click(completedOrder)
				action.WaitForPageToLoad()
				action.WaitVisible(plusIcon)  //need to change xpath
				println ("completed Order link is enable");
			}
			else{
				throw new Exception("Failed ")
			}
		}
		catch(Exception e)
		{
			println ("Click And Verify Completed Orders Link failed due to "+e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickAndVerifyWarehouseItemLink() {
		try{
			action.WaitVisible(warehouseItem)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(warehouseItem)
			if(statuswareHouseOrderLink == true){
				action.Click(warehouseItem)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("WarehouseItem.aspx")
			}
			else{
				throw new Exception ("Ware house item is disabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify Warehouse Item Link failed due to "+ e)
		}
	}


	@Keyword
	public void ClickAndVerifyWarehouseItemInventoryLink() {
		action.WaitVisible(warehouseItemInventory)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(warehouseItemInventory)
		if(statuswareHouseOrderLink == true){
			action.Click(warehouseItemInventory)
			action.WaitForPageToLoad()
			action.WaitVisible(plusIcon)  //need to change xpath
			println ("Warehouse item inventory link is enable");
		}
	}

	@Keyword
	public void ClickAndVerifyItemPickListLink() {
		try{
			action.WaitVisible(itemPackList)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(itemPackList)
			if(statuswareHouseOrderLink == true){
				action.Click(itemPackList)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("TelerikPickList.aspx?ItemPicklist")
			}
			else{
				throw new Exception("Item pack list link is not enabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify Item Pick List Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyItemPickListPage() {
		try{
			action.VerifyCurrentPage("ItemPicklist")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Item Pick List Page failed due to "+ e)
		}
	}

	@Keyword
	public void ClickAndVerifyOrderPackListLink() {
		try{
			action.WaitVisible(orderPackList)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(orderPackList)
			if(statuswareHouseOrderLink == true){
				action.Click(orderPackList)
				action.WaitForPageToLoad()
				action.WaitVisible(plusIcon)  //need to change xpath
				println ("Warehouse item inventory link is enable");
			}
			else{
				throw new Exception ("Ware house item inventory link is disabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify Order Pack List Link failed due to "+ e)
		}
	}


	@Keyword
	public void ClickAndVerifyReportBatchesLink() {
		try{
			action.WaitVisible(reportBatches)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(reportBatches)
			if(statuswareHouseOrderLink == true)
			{
				action.Click(reportBatches)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("WarehouseOrderReportBatch.aspx")
			}
			else{
				Assert.fail("Click And Verify Report Batches Link is disabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify Report Batches Link failed due to "+ e)
		}
	}

	@Keyword
	public void VerifyReportBatchesPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrders.aspx")
		}
		catch(Exception e)
		{
			Assert.fail("Verify Report Batches Page failed due to "+ e)
		}
	}

	@Keyword
	public void ClickAndVerifyUserGuideLink() {
		try{
			action.WaitVisible(userGuide)
			boolean statuswareHouseOrderLink = action.IsElementEnabled(userGuide)
			if(statuswareHouseOrderLink == true){
				action.Click(userGuide)
				action.WaitForPageToLoad()
				action.VerifyCurrentPage("POSWarehouseUserGuideGeneric.pdf")
			}
			else{
				throw new Exception ("User Guide link is not enabled")
			}
		}
		catch(Exception e)
		{
			Assert.fail("Click And Verify User Guide Link failed due to "+ e)
		}
	}


	@Keyword
	public void ClickOnUserItemApprovalTransfer()
	{
		try{
			action.MouseHoverOnElement(warehouse)
			WebUI.delay(5)
			action.MouseHoverOnElement(admin)
			WebUI.delay(5)
			action.Click(useritemapprovaltransfer)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Click On User Item Approval Transfer failed due to "+ e)
		}
	}

	@Keyword
	public void ClickOnWarehouseUsers()
	{
		try{
			action.MouseHoverOnElement(warehouse)
			WebUI.delay(5)
			action.MouseHoverOnElement(admin)
			WebUI.delay(5)
			action.Click(warehouseusers)
			action.WaitForPageToLoad()
		}
		catch(Exception e)
		{
			Assert.fail("Click On Warehouse Users failed due to "+ e)
		}
	}
	
	@Keyword
	public void ClickOnOrderPackList()
	{
		try
		{
			action.WaitVisible(OrderPcakListLink)
			action.Click(OrderPcakListLink)
			action.WaitForPageToLoad()
			
			
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnOrderPackList method failed due to :" + e)
		}
	}

	@Keyword
	public void ClickOnPrintIconAndVerifyOrderPackListReport()
	{
		try
		{
			action.Click(PrintIcon)
			
		}
		catch(Exception e)
		{
			Assert.fail("ClickOnPrintIconAndVerifyOrderPackListReport method failed due to :" + e)
		}
	}
}
