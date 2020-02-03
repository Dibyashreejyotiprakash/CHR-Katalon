import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToInstantImpactDist'(GlobalVariable.distcorpusername, GlobalVariable.distcorppassword)

CustomKeywords.'com.ii4usersites.HomePage.VerifyHomePage'()

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnVariableTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnTestTemplate'(GlobalVariable.distcorptemplateid)

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnCreateYourOwnDesignAndNavigateToCreateDesignPage'()

CustomKeywords.'com.ii4usersites.CreateDesignPage.ClickOnPreviewChangesButton'()

CustomKeywords.'com.ii4usersites.CreateDesignPage.ClickOnNextStepBtnAndNavigateToProductSelectionPage'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.SetQuantity'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.ClickOnNo'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.ClickOnAddToKart'()

CustomKeywords.'com.ii4usersites.ShoppingCartPage.ClickOnCheckOutBtn'()

CustomKeywords.'com.ii4usersites.CheckOutPage.ClickOnContinueToReview'()

CustomKeywords.'com.ii4usersites.ReviewPage.ClickOnPlaceOrderBtn'()

String confirmationno= CustomKeywords.'com.ii4usersites.ConfirmationPage.GetConfirmationId'()

WebUI.closeBrowser()

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamedesigntracker, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'(GlobalVariable.dtusername, GlobalVariable.dtpassowrd)

CustomKeywords.'com.designtracker.HomePage.ClickOnJobSearch'()

CustomKeywords.'com.designtracker.JobSearchPage.VerifyJobSearchPage'()

CustomKeywords.'com.designtracker.JobSearchPage.VerifyCreatedJobInDTSearchPage'(confirmationno)