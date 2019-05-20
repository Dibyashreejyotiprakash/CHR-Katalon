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

WebUI.openBrowser('http://designtracker.uat.brandmuscle.net/login.aspx?ReturnUrl=%2f')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/UserName'), 'dibyashree.jyoti@brandmuscle.com')

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/Password'), 'dibya@1234')

WebUI.click(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/LoginBtn'))

WebUI.waitForPageLoad(0)

WebUI.getUrl()

WebUI.scrollToElement(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/ResetBtn'), 0)

WebUI.verifyElementClickable(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/ResetBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/Jobs'), 0)

WebUI.mouseOver(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/Jobs'))

WebUI.mouseOver(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/SearchBtn'))

WebUI.click(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/SearchBtn'))

WebUI.scrollToElement(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/SelectLink'), 0)

WebUI.click(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/SelectLink'))

WebUI.waitForPageLoad(0)

WebUI.getUrl()

WebUI.closeBrowser()

