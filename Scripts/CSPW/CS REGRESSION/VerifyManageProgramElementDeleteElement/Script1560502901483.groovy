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

CustomKeywords.'com.utilities.Interactions.GetUrl'(GlobalVariable.bunameconsolidator, GlobalVariable.testtype, GlobalVariable.environment)

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/LoginBtn'), 0)

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Username'), GlobalVariable.consolusername)

WebUI.setText(findTestObject('CONSOLIDATOR/LogInPage/Password'), GlobalVariable.conslopassword)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitDropdown'))

WebUI.click(findTestObject('CONSOLIDATOR/LogInPage/BusinessUnitName'))

WebUI.waitForPageLoad(30)

WebUI.mouseOverOffset(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Modules'), 0, 0)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/UpdateLogPage/span_Consolidator'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitDropDown'))

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/ParentBusinessUnitName'))

WebUI.click(findTestObject('CONSOLIDATOR/ParentBusinessUnit/SubmitBtn (1)'))

WebUI.waitForPageLoad(300)

WebUI.navigateToUrl('https://admintool.v5qa.brandmuscle.net/Admin/Consolidator/ConsolidatorManageProgramItem.aspx')

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ManageProgramElementPage/headerManageProgramElements'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ManageProgramElementPage/FirstEditLinkProgram'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ManageProgramElementPage/btnAddNewElement'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ManageProgramElementPage/FirstElementEditLink'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('CONSOLIDATOR/ManageProgramElementPage/DeleteElementLink'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ManageProgramElementPage/DeleteElementLink'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.click(findTestObject('CONSOLIDATOR/ManageProgramElementPage/CheckBoxDelete'))

WebUI.waitForElementClickable(findTestObject('CONSOLIDATOR/ManageProgramElementPage/PopUpDeleteBtn'), 0)

WebUI.click(findTestObject('CONSOLIDATOR/ManageProgramElementPage/PopUpDeleteBtn'))

WebUI.waitForPageLoad(300)

WebUI.closeBrowser()

