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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://astha.nigam:Jobchange@123@wswadmin.uat.brandmuscle.net/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'), 30)

WebUI.delay(3)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/InstantImpactMenu'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'), 30)

WebUI.mouseOver(findTestObject('II-WSWADMIN/MainMenu/Meta Tagging Category-Item Maintenance'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingBulkImportPage'), 10)

WebUI.click(findTestObject('II-WSWADMIN/MainMenu/MetaTaggingBulkImportPage'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/CorpDropDownBulkPage'), 10)

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ItemTypeDropDownBulkPage'), 10)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/CorpDropDownBulkPage'))

WebUI.waitForElementPresent(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/searchCorporation'), 10)

WebUI.setText(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/searchCorporation'), '44 - Diageo')

WebUI.delay(10)

WebUI.sendKeys(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/searchCorporation'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ItemTypeDropDownBulkPage'))

WebUI.delay(3)

CustomKeywords.'com.utilities.Interactions.UploadFile'(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/FileUploadTab'), 
    'C:\\Users\\dibyashree.jyoti\\Desktop\\checkTemplate.txt')

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/UploadBtn'), 300)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/UploadBtn'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ActionTypeRadioBtn'), 300)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ActionTypeRadioBtn'))

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ContinueBtn'), 300)

WebUI.scrollToElement(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ContinueBtn'), 0)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/ContinueBtn'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/AdminApprovalCheckbox'), 300)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/AdminApprovalCheckbox'))

WebUI.scrollToPosition(6000, 6000)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/SaveSelected'), 300)

WebUI.click(findTestObject('II-WSWADMIN/BulkMetaTaggingPage/SaveSelected'))

WebUI.closeBrowser()

