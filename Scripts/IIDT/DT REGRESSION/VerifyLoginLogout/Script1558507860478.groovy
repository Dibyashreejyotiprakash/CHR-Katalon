<<<<<<< HEAD:Scripts/CSPW/CS SMOKE/Test/Script1558093501887.groovy
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

WebUI.navigateToUrl('http://designtracker.uat.brandmuscle.net/login.aspx?ReturnUrl=%2f')

WebUI.setText(findTestObject('DesignTracke/input_Username_ctl00cphMainLoginCentivUserName'), 
    'dibyashree.jyoti@brandmuscle.com')

WebUI.setEncryptedText(findTestObject('DesignTracke/input_Password_ctl00cphMainLoginCentivPassword'), 
    '8bxY5gEhEkwKDaQT9s4tsg==')

WebUI.click(findTestObject('DesignTracke/input__ctl00cphMainLoginCentivLoginButton'))

WebUI.click(findTestObject('DesignTracke/input_Jobs with Inventoried Parts_ctl00ctl00cphMaincphMainbtnSearch'))

WebUI.click(findTestObject('DesignTracke/a_Select'))

WebUI.click(findTestObject('DesignTracke/input_Jobs with Inventoried Parts_ctl00ctl00cphMaincphMainbtnReset'))

WebUI.click(findTestObject('DesignTracke/span_SEARCH'))

WebUI.closeBrowser()

WebUI.click(findTestObject('DesignTracke/span_HOME'))

=======
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

WebUI.navigateToUrl('http://designtracker.uat.brandmuscle.net/login.aspx?ReturnUrl=%2f')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/UserName'), 'dibyashree.jyoti@brandmuscle.com')

WebUI.setEncryptedText(findTestObject('DESIGNTRACKER/LoginPage/Password'), '8bxY5gEhEkwKDaQT9s4tsg==')

WebUI.click(findTestObject('DESIGNTRACKER/LoginPage/LoginBtn'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('DESIGNTRACKER/HomePage/LogOutLink'))

WebUI.closeBrowser()

>>>>>>> baaa14859c784da5a5cbba7a89d39089048059fc:Scripts/IIDT/DT REGRESSION/VerifyLoginLogout/Script1558507860478.groovy
