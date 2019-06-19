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

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/Menu Books'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/Label Job LineName'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl Product Group'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl Product Group'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ProdGroup_ Spyglass'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ProdGroup_ Spyglass'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl_Outside Color'), 30)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl_Outside Color'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/OutColor_Navy'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/OutColor_Navy'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl_MenuStyle'), 300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl_MenuStyle'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl_MenuStyle'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/Mnstyle_Double Pocket'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/Mnstyle_Double Pocket'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/Mnstyle_Double Pocket'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddlMenuSize'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddlMenuSize'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/MnSize_8.5x11'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/MnSize_8.5x11'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddlMetal Corner type'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddlMetal Corner type'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddlMetal Corner type'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/opt_Metal Corner types'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/opt_Metal Corner types'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl metal Corner colour'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/ddl metal Corner colour'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/MetalCornerColor'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/MetalCornerColor'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/BtnNext'), 0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/BtnNext'), 300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Menu Books Page/BtnNext'))

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn AddNewNote'), 
    0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn AddNewNote'), 
    300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btn AddNewNote'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/txb AddNewNote'), 
    0)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/txb AddNewNote'), 
    'test')

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btnSave'), 
    0)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btnSave'), 
    0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Print Details 2 Page/btnSave'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'), 0)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Accessories Finishing Details/btn Next'))

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

