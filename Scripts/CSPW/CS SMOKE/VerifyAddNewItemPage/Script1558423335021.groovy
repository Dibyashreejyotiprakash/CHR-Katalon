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

WebUI.openBrowser('Chrome')

CustomKeywords.'com.utilities.DemooInteractions.GetUrl'('CONSOLIDATOR', GlobalVariable.testtypesmoke, GlobalVariable.environment)

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/Username'), 30)

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Username'), GlobalVariable.consolusername)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/Password'), 30)

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Password'), GlobalVariable.conslopassword)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'))

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitName'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitName'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/UpdateLogPage/Select Business UnitBtn'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/UpdateLogPage/Select Business UnitBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'))

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitName'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitName'))

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/SubmitBtn (1)'))

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Modules'), 30)

WebUI.mouseOverOffset(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Modules'), 0, 0)

WebUI.mouseOver(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'))

WebUI.click(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'))

WebUI.waitForPageLoad(30)

WebUI.navigateToUrl('https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/ConsolidatorManageBaseElement.aspx')

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ManageElementsPage/AddNewItemBtn'), 30)

WebUI.click(findTestObject('CONSOLIDATOR/ManageElementsPage/AddNewItemBtn'))

WebUI.closeBrowser()

