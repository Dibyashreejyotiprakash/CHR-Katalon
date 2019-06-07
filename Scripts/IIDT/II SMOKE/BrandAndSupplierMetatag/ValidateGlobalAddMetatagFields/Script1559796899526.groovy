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

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'), 30)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'), 30)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/MainMenu/GlobalMetaTaggingPage'), 10)

WebUI.click(findTestObject('II-WSWADMIN/MainMenu/GlobalMetaTaggingPage'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/SelectCategoryDropDown'), 10)

WebUI.click(findTestObject('II-WSWADMIN/GlobalMetaTagging/SelectCategoryDropDown'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/SearchCategoryField'), 10)

WebUI.click(findTestObject('II-WSWADMIN/GlobalMetaTagging/SearchCategoryField'))

WebUI.sendKeys(findTestObject('II-WSWADMIN/GlobalMetaTagging/SearchCategoryField'), 'Brand Category')

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/SelectBrandCategory'), 10)

WebUI.click(findTestObject('II-WSWADMIN/GlobalMetaTagging/SelectBrandCategory'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/AddNewMetaTagBtn'), 10)

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/GlobalSearchBox'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('II-WSWADMIN/GlobalMetaTagging/AddNewMetaTagBtn'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/AddNewMetaTagBox'), 10)

WebUI.verifyElementPresent(findTestObject('II-WSWADMIN/GlobalMetaTagging/CancelAddMetaTagBtn'), 0)

