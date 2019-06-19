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

WebUI.navigateToUrl(GlobalVariable.iiadminurl)

WebUI.waitForPageLoad(300)

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://iiadmin.uat.brandmuscle.net/SystemSetup/ShippingAgents.aspx')

WebUI.waitForPageLoad(300)

WebUI.waitForElementVisible(findTestObject('IIADMIN/ShippinAgentsPage/SelectAgentDdn'), 300)

WebUI.selectOptionByIndex(findTestObject('IIADMIN/ShippinAgentsPage/SelectAgentDdn'), '29', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.scrollToPosition(1200, 1200)

WebUI.waitForElementVisible(findTestObject('IIADMIN/ShippinAgentsPage/NewLink'), 300)

WebUI.click(findTestObject('IIADMIN/ShippinAgentsPage/NewLink'))

WebUI.setText(findTestObject('IIADMIN/ShippinAgentsPage/Startrange'), '300')

WebUI.setText(findTestObject('IIADMIN/ShippinAgentsPage/EndRange'), '500')

WebUI.waitForElementVisible(findTestObject('IIADMIN/ShippinAgentsPage/CorpIdDdn'), 300)

WebUI.click(findTestObject('IIADMIN/ShippinAgentsPage/CorpIdDdn'))

WebUI.waitForElementVisible(findTestObject('IIADMIN/ShippinAgentsPage/SelectAllcheckbox'), 300)

WebUI.click(findTestObject('IIADMIN/ShippinAgentsPage/SelectAllcheckbox'))

WebUI.selectOptionByIndex(findTestObject('IIADMIN/ShippinAgentsPage/salesProdLineKey'), 1)

WebUI.waitForElementVisible(findTestObject('IIADMIN/ShippinAgentsPage/ItemKey'), 300)

WebUI.setText(findTestObject('IIADMIN/ShippinAgentsPage/ItemKey'), '354672')

WebUI.click(findTestObject('IIADMIN/ShippinAgentsPage/InsertBtn'))

