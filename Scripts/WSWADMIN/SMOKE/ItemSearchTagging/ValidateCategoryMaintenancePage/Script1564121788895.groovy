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

WebUI.navigateToUrl('http://astha.nigam:Zindagi@123@wswadmin.uat.brandmuscle.net/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/InstantImpactTab'), 30)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/InstantImpactTab'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'), 30)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingCategoryMaintenance'), 30)

WebUI.click(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingCategoryMaintenance'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemTab'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemCorpSetting'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemDesc'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/SaveBtn'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ClearBtn'), 10)

