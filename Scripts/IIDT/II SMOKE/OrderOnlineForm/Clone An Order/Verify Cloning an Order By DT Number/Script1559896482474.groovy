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

WebUI.navigateToUrl('http://ii4.uat.brandmuscle.net')

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/txbUserName'), 'demoqa@brandmuscle.com')

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/txbPassword'), 'go2web')

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/btnLogin'))

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlCorporation'), 5)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlCorporation'))

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlCorporation'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlDistributor'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlDistributor'))

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/ddlDistributor'), 1)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Login Page/btnLogin'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Order Form'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Landing Page/Clone A Previous DT Order'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/txb New Account Name'), 30)

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/txb New Account Name'), 'test')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/CalDueDate'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/CalDueDate'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/btn Continue to Items'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Job Search Page/txb Search By DT Number'), '2342094')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Job Search Page/btn Find Jobs'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Job Search Page/btn Find Jobs'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Search Results Page/Searched DT Number'), 
    0)

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Search Results Page/Btn ExpandColumn'))

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Search Results Page/chkbx JobLineId'))

not_run: WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Search Results Page/btn Add Selected Item(s)'), 
    0)

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Search Results Page/btn Add Selected Item(s)'))

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Edit'))

not_run: WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn AddNewNote'), 
    0)

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn AddNewNote'))

not_run: WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/txb AddNewNote'), 'test')

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btnSave'))

not_run: WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn Next'), 0)

not_run: WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn Next'))

WebUI.closeBrowser()

