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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamedesigntracker, GlobalVariable.testtypesmoke, GlobalVariable.environment)

WebUI.waitForPageLoad(300)

CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'(GlobalVariable.dtusername, GlobalVariable.dtpassowrd)

WebUI.waitForPageLoad(0)

CustomKeywords.'com.designtracker.HomePage.VerifyREPORTSTab'()

CustomKeywords.'com.designtracker.HomePage.SelectCorporationAndMarcket'()

 String JobID =   CustomKeywords.'com.designtracker.HomePage.SelectFirstJobID'()
 
 println ("Job id is "+ JobID)

CustomKeywords.'com.designtracker.HomePage.ClickOnJobEfficiency'()

WebUI.delay(5)

CustomKeywords.'com.designtracker.HomePage.WindowHandle'()

CustomKeywords.'com.designtracker.JobEfficiency.EnterJobID'(JobID)

CustomKeywords.'com.designtracker.JobEfficiency.ClickOnViewReportBtn'()

CustomKeywords.'com.designtracker.JobEfficiency.VerifyJobEfficiencyReportFields'()



CustomKeywords.'com.designtracker.JobActivityTracking.CloseAllBrowser'()

