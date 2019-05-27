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

WebUI.navigateToUrl('http://designtracker.uat.brandmuscle.net')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/LoginPage/UserName'), 30)

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/UserName'), 'dibyashree.jyoti@brandmuscle.com')

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/LoginPage/Password'), 30)

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Password'), 'dibya@1234')

WebUI.click(findTestObject('DESIGNTRACKER/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/HomePage/SITEADMINISTRATION'), 
    30)

WebUI.mouseOverOffset(findTestObject('DESIGNTRACKER/HomePage/SITEADMINISTRATION'), 0, 
    0)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/HomePage/EXCEPTION LIST - SALES PEOPLE'), 
    30)

WebUI.mouseOver(findTestObject('DESIGNTRACKER/HomePage/EXCEPTION LIST - SALES PEOPLE'))

WebUI.click(findTestObject('DESIGNTRACKER/HomePage/EXCEPTION LIST - SALES PEOPLE'))

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()
