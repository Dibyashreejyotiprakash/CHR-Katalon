import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameposw, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.poswm.LoginPage.PoswLogin'(GlobalVariable.posusername, GlobalVariable.pospassword)

CustomKeywords.'com.poswm.Homepage.ClickOnNewOrder'()

CustomKeywords.'com.poswm.NewOrderPage.ClickOnOrderIdBtn'()

CustomKeywords.'com.poswm.WarehouseOrders.VerifyNewOrderPage'()

CustomKeywords.'com.poswm.WarehouseOrders.VerifyAndClickOnAddOrderIcon'()

CustomKeywords.'com.poswm.WarehouseOrders.VerifyAddItemLink'()

CustomKeywords.'com.poswm.WarehouseOrders.selectSalesDevision'()

CustomKeywords.'com.poswm.WarehouseOrders.AddItemAndVerifyMsg'()

CustomKeywords.'com.poswm.WarehouseOrders.AddCustomerAndVerifyMsg'()

CustomKeywords.'com.poswm.WarehouseOrders.AddDesiredShippingDateAndVerifyMsg'()

CustomKeywords.'com.poswm.WarehouseOrders.AddShipingMethodAndVerifyMsg'()

CustomKeywords.'com.poswm.WarehouseOrders.ClickOnSubmitOrderBtnAndevrifyMsg'()

/*
//Click on new item
CustomKeywords.'com.poswm.WarehouseDashBoardPage.ClickOnNewItem'()
//vcreate item with unique name
String ItemName = CustomKeywords.'com.poswm.WarehouseItem.FillItemInformationSection'()
// fill image section
CustomKeywords.'com.poswm.WarehouseItem.FillImageSection'()
//Fill brand section
CustomKeywords.'com.poswm.WarehouseItem.FillBrandSection'()
// Fill transaction section
CustomKeywords.'com.poswm.WarehouseItem.FillTransactionsSection'()
//  Save item name
CustomKeywords.'com.poswm.WarehouseItem.ClickOnCloseEditMode'()
//navigate to spen limit page
CustomKeywords.'com.poswm.Homepage.ClickOnWarehouseSpendLimits'()
// select 2020 compliance name
CustomKeywords.'com.poswm.WarehouseSpendingLimits.ClickOn2020Compliance'()
//add item to the compliance
CustomKeywords.'com.poswm.WarehouseSpendingLimits.AddItemTotheComplianceLevel'(ItemName)
//navigate to item search page
CustomKeywords.'com.poswm.WarehouseDashBoardPage.ClickOnItemSearch'()
//select sales divsion as Big Apple
CustomKeywords.'com.poswm.WarehouseItemInventory.SelectBigAppleSalesDivisionForEmpireMerchant'()
//search for the newly created item
CustomKeywords.'com.poswm.WarehouseItemInventory.SearchSpecificItem'(ItemName)
// add item  to cart
CustomKeywords.'com.poswm.WarehouseItemInventory.AddToCart'()
//add customer
CustomKeywords.'com.poswm.WarehouseItemInventory.AddCustomer'()
// select ship method
CustomKeywords.'com.poswm.WarehouseItemInventory.SelectShipMethod'()
//place order
CustomKeywords.'com.poswm.WarehouseItemInventory.ClickOnSubmitOrderBtn'()

CustomKeywords.'com.poswm.WarehouseOrders.ClickOnSubmitOrderBtnAndevrifyMsg'()

CustomKeywords.'com.poswm.WarehouseDashBoardPage.ClickOnItemSearch'()
//select sales divsion as Big Apple
CustomKeywords.'com.poswm.WarehouseItemInventory.SelectBigAppleSalesDivisionForEmpireMerchant'()
//search for the newly created item
CustomKeywords.'com.poswm.WarehouseItemInventory.SearchSpecificItem'(ItemName)
//select first item from the list
CustomKeywords.'com.poswm.WarehouseItemInventory.SelectFirstItem'()
// delete selected item
CustomKeywords.'com.poswm.WarehouseItem.DeleteItem'()
*/
