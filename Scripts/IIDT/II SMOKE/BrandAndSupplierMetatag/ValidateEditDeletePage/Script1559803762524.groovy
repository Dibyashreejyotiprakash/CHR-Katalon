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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://astha.nigam:Jobchange@123@wswadmin.uat.brandmuscle.net/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('null'), 30)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('null'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'), 30)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingEdit-Delete'), 10)

WebUI.click(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingEdit-Delete'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/MetatagEditDelete/CorporationFilter'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/MetatagEditDelete/MetaTagFilter'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/MetatagEditDelete/EditBtn'), 10)

WebUI.click(findTestObject('II-WSWADMIN/MetatagEditDelete/EditBtn'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/MetatagEditDelete/MetaTagEditTextBox'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/MetatagEditDelete/UpdateBtn'), 10)

