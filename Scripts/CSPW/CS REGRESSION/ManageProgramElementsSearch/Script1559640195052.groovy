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

WebUI.navigateToUrl('https://admintool.v5qa.brandmuscle.net')

WebUI.waitForPageLoad(30)

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Username'), 'chrtestuser@brandmuscle.com')

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Password'), 'Ownlocal@123')

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'))

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitName'))

WebUI.waitForPageLoad(30)

WebUI.mouseOverOffset(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Modules'), 0, 0)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'), 0)

WebUI.mouseOver(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'))

WebUI.click(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'))

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitName'))

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/SubmitBtn (1)'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx')

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ManageProgramElementPage/ManageProgramElementsLabel'), 0)

WebUI.clearText(findTestObject('CONSOLIDATOR/ManageProgramElementPage/txbSearchForProgram'))

WebUI.setText(findTestObject('CONSOLIDATOR/ManageProgramElementPage/txbSearchForProgram'), 'demo')

WebUI.closeBrowser()
