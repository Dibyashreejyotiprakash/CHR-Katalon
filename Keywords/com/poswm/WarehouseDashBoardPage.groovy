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


	@Keyword
	public void VerifyMyOrdersDivision(){


		try{
			action.WaitTime(2)
			boolean statusPendinShipDiv = action.IsElementDisplayed(myOrderDivision)
			if(statusPendinShipDiv == true) {

				//			action.Click(pendinApprovalExpandBtn)
				//			action.WaitVisible(pendinShipmentExpandBtn)
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

				//			action.Click(pendinApprovalExpandBtn)
				//			action.WaitVisible(pendinShipmentExpandBtn)
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
					throw new Exception ("Failed")
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

				//			action.Click(pendinApprovalExpandBtn)
				//			action.WaitVisible(pendinShipmentExpandBtn)

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
					throw new Exception ("Failed")
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
				action.WaitVisible(plusIcon)
				println ("WareHouseOrderLink is enable");
			}
		}
		catch(Exception e)
		{
			println ("Click And Verify Ware House Order Link failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void VerifyWareHouseOrderPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrders.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Ware House Order Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickAndVerifyWareHouseOrderInventoryLink() {
		action.WaitVisible(warehouseOrderInventory)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(warehouseOrderInventory)
		if(statuswareHouseOrderLink == true){
			action.Click(warehouseOrderInventory)
			action.WaitForPageToLoad()
			action.WaitVisible(OrderInventoryCreateNewBtn)  //need to change xpath
			println ("warehouseOrderInventory is enable");
		}
	}

	@Keyword
	public void VerifyWareHouseOrderInventoryPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrderInventory.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Ware House Order Inventory Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickAndVerifyDraftOrdersLink() {
		action.WaitVisible(draftOrder)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(draftOrder)
		if(statuswareHouseOrderLink == true){
			action.Click(draftOrder)
			action.WaitForPageToLoad()
			action.WaitVisible(downloadDivisionForDraftOrder)  //need to change xpath
			println ("draftOrder link is enable");
		}
	}

	@Keyword
	public void VerifyDraftOrdersPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrderInventory.aspx?status=Created")
		}
		catch(Exception e)
		{
			println ("Verify Draft Order failed due to "+ e)
			Assert.fail()
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
	public void VerifyCompletedOrdersPage() {
		//		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		//		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		//		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseOrders.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

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
			println (Assert.fail())
		}
	}



	@Keyword
	public void ClickAndVerifyWarehouseItemLink() {
		action.WaitVisible(warehouseItem)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(warehouseItem)
		if(statuswareHouseOrderLink == true){
			action.Click(warehouseItem)
			action.WaitForPageToLoad()
			action.WaitVisible(ItemInfoDiv)
			println ("completed Order link is enable");
		}
	}

	@Keyword
	public void VerifyWarehouseItemPage() {
		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseItem.aspx";
		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseItem.aspx"
		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseItem.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

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
			println (Assert.fail())
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
	public void VerifyWarehouseItemInventoryPage() {
		//		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		//		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		//		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseOrders.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

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
			println (Assert.fail())
		}
	}

	@Keyword
	public void ClickAndVerifyItemPickListLink() {
		action.WaitVisible(itemPackList)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(itemPackList)
		if(statuswareHouseOrderLink == true){
			action.Click(itemPackList)
			action.WaitForPageToLoad()
			action.WaitVisible(plusIcon)  //need to change xpath
			println ("Warehouse item inventory link is enable");
		}
	}

	@Keyword
	public void VerifyItemPickListPage() {
		//		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		//		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		//		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseOrders.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

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
			println (Assert.fail())
		}
	}

	@Keyword
	public void ClickAndVerifyOrderPackListLink() {
		action.WaitVisible(orderPackList)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(orderPackList)
		if(statuswareHouseOrderLink == true){
			action.Click(orderPackList)
			action.WaitForPageToLoad()
			action.WaitVisible(plusIcon)  //need to change xpath
			println ("Warehouse item inventory link is enable");
		}
	}

	@Keyword
	public void VerifyOrderPackListPage() {
		//		String expectedUATUrl = "https://csg.v5qa.brandmuscle.net/Warehouse/WarehouseOrders.aspx";
		//		String expectedSTAGEUrl ="https://csg.v5stage.brandmuscle.net/Warehouse/WarehouseOrders.aspx"
		//		String expectedPRODUrl = "https://csg.brandmuscle.net/Warehouse/WarehouseOrders.aspx";



		String env = GlobalVariable.environment
		String actualUrl = action.GetCurrentURL()

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
			println (Assert.fail())
		}
	}


	@Keyword
	public void ClickAndVerifyReportBatchesLink() {
		action.WaitVisible(reportBatches)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(reportBatches)
		if(statuswareHouseOrderLink == true){
			action.Click(reportBatches)
			action.WaitForPageToLoad()
			action.WaitVisible(plusIcon)  //need to change xpath
			println ("Warehouse item inventory link is enable");
		}
	}

	@Keyword
	public void VerifyReportBatchesPage() {
		try{
			action.VerifyCurrentPage("WarehouseOrders.aspx")
		}
		catch(Exception e)
		{
			println ("Verify Report Batches Page failed due to "+ e)
			Assert.fail()
		}
	}

	@Keyword
	public void ClickAndVerifyUserGuideLink() {
		action.WaitVisible(userGuide)
		boolean statuswareHouseOrderLink = action.IsElementEnabled(userGuide)
		if(statuswareHouseOrderLink == true){
			action.Click(userGuide)
			action.WaitForPageToLoad()
			action.WaitVisible(plusIcon)  //need to change xpath
			println ("Warehouse item inventory link is enable");
		}
	}













}
