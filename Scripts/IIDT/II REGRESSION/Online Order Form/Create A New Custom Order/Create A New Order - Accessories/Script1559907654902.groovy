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

WebUI.waitForPageLoad(60)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Order Form'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Order Form'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Landing Page/Create A New Custom Order'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/txb New Account Name'), 0)

WebUI.waitForAlert(2)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/txb New Account Name'), 'test')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/CalDueDate'), 30)

WebUI.waitForAlert(2)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/CalDueDate'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/btn Continue to Items'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/Accessories'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/txb JobLineName'), 0)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/txb JobLineName'), 'test')

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ddl Product Group'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ddl Product Group'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ProductGroup_Light Box'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ProductGroup_Light Box'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ddl Menu Size'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/ddl Menu Size'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/MenuSize'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/MenuSize'))

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/LabelMenuSize'), 30)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/btnNext'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Page/btnNext'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn AddNewNote'), 
    0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn AddNewNote'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn AddNewNote'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/txb AddNewNote'), 
    0)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/txb AddNewNote'), 
    'test')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btnSave'), 
    0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btnSave'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btnSave'))

not_run: WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'), 0)

not_run: WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn Next'), 
    30)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn MyItems'), 30)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'), 30)

not_run: WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn Next'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Brand Mentions Page/btn_No Brand Mentions Click Here'), 
    0)

WebUI.waitForElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Brand Mentions Page/btn_No Brand Mentions Click Here'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Brand Mentions Page/btn_No Brand Mentions Click Here'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Shipping Page/btn Next'), 0)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Shipping Page/btn Next'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Shipping Page/btn Next'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'), 
    0)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Summary Page/btn Complete Order'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Logout'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Logout'))

WebUI.closeBrowser()

