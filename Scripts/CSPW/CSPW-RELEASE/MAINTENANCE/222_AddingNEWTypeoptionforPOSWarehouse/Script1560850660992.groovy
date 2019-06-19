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

CustomKeywords.'com.utilities.Interactions.GetUrl'(GlobalVariable.bunameposw, GlobalVariable.testtype, GlobalVariable.environment)

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/LoginBtn'), 0)

WebUI.setText(findTestObject('POSW/LoginPage/UserNameTxtBox'), 'adminny@brandmuscle.com')

WebUI.setText(findTestObject('POSW/LoginPage/PasswordTxtBox'), 'password')

WebUI.click(findTestObject('POSW/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.waitForPageLoad(30)

WebUI.waitForElementVisible(findTestObject('POSW/LoginPage/btnOrderIDSearch'), 0)

WebUI.waitForElementVisible(findTestObject('POSW/DashboardPage/MenuWarehouse'), 0)

WebUI.mouseOverOffset(findTestObject('POSW/DashboardPage/MenuWarehouse'), 0, 0)

WebUI.waitForElementVisible(findTestObject('POSW/DashboardPage/SubMenuItemSearch'), 0)

WebUI.click(findTestObject('POSW/DashboardPage/SubMenuItemSearch'))

WebUI.waitForElementVisible(findTestObject('POSW/ItemSearchPage/FirstItemName'), 300)

WebUI.click(findTestObject('POSW/ItemSearchPage/FirstItemName'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('POSW/ItemSearchPage/btnDelete'), 0)

WebUI.click(findTestObject('POSW/ItemSearchPage/btnDelete'))

WebUI.acceptAlert()

WebUI.waitForElementVisible(findTestObject('POSW/ItemSearchPage/DeletePopUp'), 0)

WebUI.click(findTestObject('POSW/ItemSearchPage/TypeDropDown'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('POSW/ItemSearchPage/DiscontinousOption'), 0)

WebUI.click(findTestObject('POSW/ItemSearchPage/DiscontinousOption'))

WebUI.closeBrowser()

