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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovalsiiusersite, GlobalVariable.testtypesmoke, GlobalVariable.environment)

WebUI.waitForPageLoad(300)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('II-USERSITE/LoginPage/UserName'), GlobalVariable.iiusersiteusername)

WebUI.setText(findTestObject('II-USERSITE/LoginPage/Password'), GlobalVariable.iiusersitepassword)

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/LoginPage/corpddn'), 300)

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/LoginPage/corpddn'), 2)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/LoginPage/distddn'), 300)

WebUI.selectOptionByIndex(findTestObject('II-USERSITE/LoginPage/distddn'), 1)

WebUI.click(findTestObject('II-USERSITE/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/Home Page/OnlineOrderForm'), 300)

WebUI.click(findTestObject('II-USERSITE/Home Page/OnlineOrderForm'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/DeafaultPage/CreateNewCustomOrder'), 300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/DeafaultPage/CreateNewCustomOrder'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/NewAccontName'), 300)

WebUI.setText(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/NewAccontName'), 'test')

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/JobType'), 300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/JobType'))

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/JobTypeValue'), 300)

WebUI.delay(5)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/JobTypeValue'))

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/btn Continue to Items'), 0)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Order Header Page/btn Continue to Items'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/Small Print Format'), 300)

WebUI.click(findTestObject('II-USERSITE/OrderOnlineForm/Item details Page/Small Print Format'))

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Print Details 1/AlI Items'), 300)

WebUI.scrollToElement(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Print Details 1/AlI Items'), 0)

WebUI.verifyElementPresent(findTestObject('II-USERSITE/OrderOnlineForm/Page_Order Form - Print Details 1/AlI Items'), 0)

WebUI.closeBrowser()

