import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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


CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamedesigntracker, GlobalVariable.testtypesmoke, GlobalVariable.environment)


CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'(GlobalVariable.dtusername, GlobalVariable.dtpassowrd)

CustomKeywords.'com.designtracker.HomePage.VerifyHomePage'()

CustomKeywords.'com.designtracker.HomePage.ClickOnNewJob'()

CustomKeywords.'com.designtracker.JobNewPage.CreateNewJob'()

String jobid = CustomKeywords.'com.designtracker.JobDetailsPage.GetJobId'()

println ("Job Id is "+ jobid)

CustomKeywords.'com.designtracker.HomePage.ClickOnSalesPeopleViewTransferButton'()

CustomKeywords.'com.designtracker.SalesPeopleJobsViewOrTransferPage.VerifyViewTransferPage'()

CustomKeywords.'com.designtracker.SalesPeopleJobsViewOrTransferPage.VerifyAddNewBtnAfterSelectingUser'()

WebUI.closeBrowser()

WebUI.openBrowser('')

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovals, GlobalVariable.testtypesmoke, GlobalVariable.environment)

WebUI.maximizeWindow()

CustomKeywords.'com.approvals.LoginPage.VerifyApprovalLoginPage'()

CustomKeywords.'com.approvals.LoginPage.ApprovalLogin'(GlobalVariable.approvalusername, GlobalVariable.approvalpassword)

CustomKeywords.'com.approvals.HomePage.VerifySearchByDTJob'(jobid)

