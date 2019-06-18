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

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/Large Print Format'))

WebUI.waitForPageLoad(30)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/img_Outdoor Banner'), 20)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/img_Outdoor Banner'), 30)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Arrow'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Arrow'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Item Type_ Floor Graphic'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Item Type_ Floor Graphic'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/txb Job Line Name'), 
    30)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/txb Job Line Name'), 
    'DemoQA')

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/ddn Size'), 
    30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/ddn Size'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Size 18x27'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Size 18x27'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/ddl Paper'), 
    30)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Paper'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/txb Paper'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/txb Paper'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Paper_vinyl'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Paper_vinyl'))

WebUI.waitForAlert(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Lamination'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Lamination'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Lamination'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Lamination_FloorGraph'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Lamination_FloorGraph'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Accessories'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/ddl Accessories'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Accesssory_Adhesive'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/Accesssory_Adhesive'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Small Print Page_Order Form - Print Details 1/btn Next'), 
    30)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/btn Next'), 300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Large Print Page_1/btn Next'))

WebUI.waitForPageLoad(0)

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

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn Next'), 
    0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Search Results/Print Details 2 Page/btn Next'), 
    30)

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

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Shipping Page/btn Next'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Shipping Page/btn Next'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'), 
    0)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/btn Continue to Order Summary'))

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Summary Page/btn Complete Order'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Logout'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Home Page/lnk Logout'))

WebUI.closeBrowser()

