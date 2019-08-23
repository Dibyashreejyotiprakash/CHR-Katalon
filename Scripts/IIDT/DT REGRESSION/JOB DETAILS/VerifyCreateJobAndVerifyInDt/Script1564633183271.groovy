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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovalsiiusersite, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToDemoCorp'(GlobalVariable.iiusersiteusername, GlobalVariable.iiusersitepassword)

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnVariableTemplate'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.SetVariableTemplateLayout'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.SelectItemType'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.Checkout'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.ValidateMinimumQuantity'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.EditShoppingCartQty'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.Checkout'()

WebUI.delay(20)

CustomKeywords.'com.ii4usersites.ItemDetailsPage.Checkout'()

WebUI.delay(20)

CustomKeywords.'com.ii4usersites.ItemDetailsPage.CheckPaymentPage'()

CustomKeywords.'com.ii4usersites.CheckOutPage.ClickOnContinueToReview'()

CustomKeywords.'com.ii4usersites.ReviewPage.ClickOnPlaceOrderBtn'()

String confirmationno = CustomKeywords.'com.ii4usersites.ConfirmationPage.GetConfirmationId'()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovalsdesigntracker, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'(GlobalVariable.dtusername, GlobalVariable.dtpassowrd)

CustomKeywords.'com.designtracker.HomePage.VerifyNewlyCreatedJobSearchInDT'(confirmationno)

CustomKeywords.'com.designtracker.JobDetailsPage.VerifyJobDetailsPage'()

WebUI.closeBrowser()





