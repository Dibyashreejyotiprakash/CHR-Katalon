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

WebUI.navigateToUrl('https://csg.v5qa.brandmuscle.net')

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/UserNameTxtBox'), 30)

WebUI.setText(findTestObject('POSW/LoginPage/UserNameTxtBox'), 'adminil@brandmuscle.com')

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/PasswordTxtBox'), 30)

WebUI.setText(findTestObject('POSW/LoginPage/PasswordTxtBox'), 'password')

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/LoginBtn'), 30)

WebUI.click(findTestObject('POSW/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/BusinessUnitDropDown'), 30)

WebUI.selectOptionByIndex(findTestObject('POSW/LoginPage/BusinessUnitDropDown'), 0)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('POSW/DashboardPage/LogoutLink'), 30)

WebUI.closeBrowser()

