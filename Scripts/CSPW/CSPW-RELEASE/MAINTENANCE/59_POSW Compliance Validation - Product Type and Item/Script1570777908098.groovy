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

WebUI.waitForPageLoad(300)

CustomKeywords.'com.poswm.LoginPage.PoswLogin'(GlobalVariable.posUN59, GlobalVariable.posPass59)

CustomKeywords.'com.poswm.LoginPage.SelectEmpireMerchantBU'()

CustomKeywords.'com.poswm.Homepage.HoverOnWareHouseMenu'()

CustomKeywords.'com.poswm.Homepage.ClickOnNewItem'()

String itemName = CustomKeywords.'com.poswm.WarehouseItem.FillItemInformationSection'()

WebUI.delay(5)

println('++++++++++++++' + itemName)

CustomKeywords.'com.poswm.WarehouseItem.ClickOnItemInfoSaveIcon'()

CustomKeywords.'com.poswm.WarehouseItem.FillImageSection'()

CustomKeywords.'com.poswm.WarehouseItem.FillBrandSection'()

CustomKeywords.'com.poswm.WarehouseItem.FillTransactionsSection'()

CustomKeywords.'com.poswm.WarehouseItem.ClickOnCloseEditMode'()

CustomKeywords.'com.poswm.Homepage.ClickOnWarehouseSpendLimits'()

CustomKeywords.'com.poswm.WarehouseSpendingLimits.ClickOn2019Compliance'()

CustomKeywords.'com.poswm.WarehouseSpendingLimits.AddItemTotheComplianceLevel'(itemName)

CustomKeywords.'com.poswm.Homepage.ClickOnItemSearch'()

CustomKeywords.'com.poswm.WarehouseItemInventory.SelectSalesDivisionForEmpireMerchant'()

CustomKeywords.'com.poswm.WarehouseItemInventory.SearchSpecificItem'(itemName)

CustomKeywords.'com.poswm.WarehouseItemInventory.AddToCart'()

CustomKeywords.'com.poswm.WarehouseItemInventory.AddCustomer'()

CustomKeywords.'com.poswm.WarehouseItemInventory.SelectShipMethod'()

CustomKeywords.'com.poswm.WarehouseItemInventory.ClickOnSubmitOrderBtn'()

CustomKeywords.'com.poswm.Homepage.ClickOnWarehouseSpendLimits'()

CustomKeywords.'com.poswm.WarehouseSpendingLimits.ClickOn2019Compliance'()

CustomKeywords.'com.poswm.WarehouseSpendingLimits.RemoveItemTotheComplianceLevel'()

String warningMsg = CustomKeywords.'com.poswm.WarehouseSpendingLimits.VerifySpendLimitWarningMsg'()

println(('**************' + warningMsg) + '****************')

