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

WebUI.openBrowser('')

WebUI.maximizeWindow()

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovalsposw, GlobalVariable.testtyperegression, GlobalVariable.environment)

WebUI.waitForPageLoad(300)

CustomKeywords.'com.poswm.LoginPage.PoswLogin'(GlobalVariable.posusername, GlobalVariable.pospassword)

CustomKeywords.'com.poswm.Homepage.ClickOnNewOrder'()

CustomKeywords.'com.poswm.NewOrderPage.ClickOnOrderIdBtn'()

CustomKeywords.'com.poswm.NewOrderPage.SelectSalesDivision'()

CustomKeywords.'com.poswm.NewOrderPage.ClickOnNewItem'()

CustomKeywords.'com.poswm.NewOrderPage.ClickOnFirstAddBtn'()

CustomKeywords.'com.poswm.NewOrderPage.AddNewCustomer'()

CustomKeywords.'com.poswm.NewOrderPage.AddDesiredShipDate'()

CustomKeywords.'com.poswm.NewOrderPage.AddShipMethod'()

CustomKeywords.'com.poswm.NewOrderPage.ClickOnSubmitOrder'()

CustomKeywords.'com.poswm.NewOrderPage.VerifyOrderConfirmationMSg'()

WebUI.closeBrowser()

