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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.wswadmin.LoginPage.WSWlogin'(GlobalVariable.wswadminusername, GlobalVariable.wswpassword)

CustomKeywords.'com.wswadmin.HomePage.NavigateToInvoiceLineItemsPage'()

CustomKeywords.'com.wswadmin.HomePage.VerifyInvoiceLineItemsPage'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyAllFromLast3Days'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyDesignTrackerLast10Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyInstantImpactLast10Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyConsolidatorLast30Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyDTJobNumberbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyInvoiceNumberbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifySalesOrderSoNumberbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyFilterExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyGridExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyExportExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceLineItems.VerifyApplybtn'()
