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

CustomKeywords.'com.wswadmin.HomePage.NavigateToInvoicePage'()

CustomKeywords.'com.wswadmin.HomePage.VerifyInvoicePage'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyAllFromLast3Days'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyDesignTrackerLast10Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyInstantImpactLast10Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyConsolidatorLast30Daysbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyDTJobNumberbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyInvoiceNumberbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyFilterExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyGridExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyExportExplanationbtn'()

CustomKeywords.'com.wswadmin.InvoiceList.VerifyApplybtn'()