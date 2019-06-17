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

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('II-USERSITE/LoginPage/UserName'), GlobalVariable.iiusersiteusername)

WebUI.setText(findTestObject('II-USERSITE/LoginPage/Password'), GlobalVariable.iiusersitepassword)

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/LoginPage/corpddn'), 2)

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/LoginPage/distddn'), 2)

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(300)

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/Search/ItemSearch.aspx?tid=1')

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net/POS/ItemDetails.aspx?tid=130722')

WebUI.waitForElementVisible(findTestObject('II-USERSITE/CreateDesignPage/OrdernowBtn'), 300)

WebUI.scrollToElement(findTestObject('II-USERSITE/CreateDesignPage/OrdernowBtn'), 0)

WebUI.click(findTestObject('II-USERSITE/CreateDesignPage/OrdernowBtn'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/Quantity'), 300)

WebUI.setText(findTestObject('II-USERSITE/ProductSelectionPage/Quantity'), '12')

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/NoBtn'), 300)

WebUI.click(findTestObject('II-USERSITE/ProductSelectionPage/NoBtn'))

WebUI.waitForElementClickable(findTestObject('II-USERSITE/ProductSelectionPage/AddToKartBtn'), 300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/ProductSelectionPage/AddToKartBtn'), 300)

