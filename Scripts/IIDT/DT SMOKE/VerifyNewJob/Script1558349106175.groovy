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

WebUI.openBrowser('http://designtracker.uat.brandmuscle.net')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/UserName'), 'dibyashree.jyoti@brandmuscle.com')

WebUI.setText(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/Password'), 'dibya@1234')

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/LoginBtn'), 0)

WebUI.click(findTestObject('DESIGNTRACKER/LoginPage/Page_DesignTracker -  Brandmuscle/LoginBtn'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/Jobs'), 0)

WebUI.mouseOverOffset(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/Jobs'), 0, 0)

WebUI.waitForElementVisible(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/New'), 0)

WebUI.mouseOver(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/New'))

WebUI.click(findTestObject('DESIGNTRACKER/HomePage/Page_DesignTracker -  Brandmuscle/New'))

WebUI.waitForPageLoad(0)

