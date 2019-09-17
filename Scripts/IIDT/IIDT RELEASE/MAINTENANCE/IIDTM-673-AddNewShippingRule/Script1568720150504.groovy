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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiadmin, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.iiadmin.LoginPage.VerifyLoginPage'()

CustomKeywords.'com.iiadmin.LoginPage.LoginToIIAdmin'(GlobalVariable.iiadminusername, GlobalVariable.iiadminpassword)

CustomKeywords.'com.iiadmin.HomePage.VerifyHomePage'()

CustomKeywords.'com.iiadmin.HomePage.ClickOnShippinAgents'()

CustomKeywords.'com.iiadmin.ShippingAgentsPage.VerifyShippingAgentsPage'()

CustomKeywords.'com.iiadmin.ShippingAgentsPage.SelectShippingAgent'()

CustomKeywords.'com.iiadmin.ShippingAgentsPage.VerifyShippingRulesExistOrNot'()

CustomKeywords.'com.iiadmin.ShippingAgentsPage.CreateNewShippingRule'()