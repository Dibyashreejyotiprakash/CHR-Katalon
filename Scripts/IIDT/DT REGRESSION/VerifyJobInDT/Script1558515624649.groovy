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

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/')

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('II-USERSITE/LoginPage/UserName'), 'diageoadmin@centiv.com')

WebUI.setText(findTestObject('II-USERSITE/LoginPage/Password'), 'go2web')

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('II-USERSITE/Home Page/CorporationLogo'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/Home Page/POSOnDemand'), 30)

WebUI.mouseOverOffset(findTestObject('II-USERSITE/Home Page/POSOnDemand'), 0, 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/Home Page/POSTemplates'), 0)

WebUI.mouseOver(findTestObject('II-USERSITE/Home Page/POSTemplates'))

WebUI.click(findTestObject('II-USERSITE/Home Page/POSTemplates'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ItemSearchPage/SearchTextBox'), 30)

WebUI.setText(findTestObject('II-USERSITE/ItemSearchPage/SearchTextBox'), '97323')

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ItemSearchPage/SearchBtn'), 30)

WebUI.click(findTestObject('II-USERSITE/ItemSearchPage/SearchBtn'))

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/POS/ItemDetails.aspx?tid=97323')

WebUI.waitForPageLoad(30)

WebUI.closeBrowser()

