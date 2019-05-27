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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net')

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/txbUserName'), 'demoqa@brandmuscle.com')

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/txbPassword'), 'go2web')

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/btnLogin'))

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlCorporation'), 
    5)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlCorporation'))

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlCorporation'), 
    2, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlDistributor'), 
    30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlDistributor'))

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/ddlDistributor'), 
    1)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Login/btnLogin'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Home Page/mnlnkOrderForm'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_Default/btnCreateNewCustomOrder'))

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_OrderHeader/txbNewAccount'), 'test')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_OrderHeader/CalDueDate'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_OrderHeader/CalDueDate'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_OrderHeader/btnContinue to Items'))

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_ItemDetails/btnSelectSmallPrint'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/CreateANewCustomOrder/Page_ItemDetails/imgLargePrint'))

WebUI.closeBrowser()

