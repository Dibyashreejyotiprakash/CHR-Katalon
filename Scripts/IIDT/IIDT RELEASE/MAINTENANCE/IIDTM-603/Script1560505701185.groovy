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

WebUI.navigateToUrl(GlobalVariable.wswadminurl)

WebUI.waitForPageLoad(300)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://wswadmin.uat.brandmuscle.net/InstantImpact/Templates/TemplateFulfillment.aspx')

WebUI.waitForPageLoad(300)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/TemplateFulfillmentPage/Header'), 0)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/TemplateFulfillmentPage/CorporationDDN'), 300)

WebUI.click(findTestObject('II-WSWADMIN/TemplateFulfillmentPage/CorporationDDN'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/TemplateFulfillmentPage/CorpName'), 300)

WebUI.click(findTestObject('II-WSWADMIN/TemplateFulfillmentPage/CorpName'))

WebUI.navigateToUrl('http://wswadmin.uat.brandmuscle.net/InstantImpact/Templates/MetatagConfiguration.aspx?cid=44&tid=7535&it=1&st=true')

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MetatagConfigurationPage/AdminApprovalCheckbox'), 300)

WebUI.click(findTestObject('II-WSWADMIN/MetatagConfigurationPage/AdminApprovalCheckbox'))

WebUI.scrollToPosition(1500, 1500)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MetatagConfigurationPage/SaveSelectedBtn'), 300)

WebUI.click(findTestObject('II-WSWADMIN/MetatagConfigurationPage/SaveSelectedBtn'))

WebUI.waitForPageLoad(300)

