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

WebUI.navigateToUrl('http://astha.nigam:Jobchange@123@wswadmin.uat.brandmuscle.net/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'), 30)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'), 30)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingCategoryMaintenance'), 30)

WebUI.click(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingCategoryMaintenance'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemTab'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemCorpSetting'), 10)

WebUI.click(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemCorpSetting'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/ItemSearchTaggingPage/CorporationTextbox'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('II-WSWADMIN/ItemSearchTaggingPage/CorporationTextbox'))

WebUI.sendKeys(findTestObject('II-WSWADMIN/ItemSearchTaggingPage/CorporationTextbox'), '276')

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/ItemSearchTaggingPage/SelectCorp'), 20)

WebUI.click(findTestObject('II-WSWADMIN/ItemSearchTaggingPage/SelectCorp'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ClearAllFilterBtn'), 10)

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/AddNewCorpSetting'), 10)

WebUI.click(findTestObject('II-WSWADMIN/CategoryMaintenancePage/AddNewCorpSetting'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/ExternalItemTypeTextbox'), 10)

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/CategoryMaintenancePage/DescOverrideTextbox'), 10)

