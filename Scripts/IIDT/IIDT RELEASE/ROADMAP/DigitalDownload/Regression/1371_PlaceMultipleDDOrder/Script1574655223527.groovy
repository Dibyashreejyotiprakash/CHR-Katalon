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

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToInstantImpactDist'('testadmin1@brandmuscle.com', 'go2web')

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ValidateDDMetatag'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.SelectTemplate'()

CustomKeywords.'com.ii4usersites.ItemDetailsPage.ClickOnCreateYourOwnDesign'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.PreviewTemplate'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.AddDDItemToCart'()

CustomKeywords.'com.ii4usersites.ShoppingCartPage.WaitForCheckoutBtn'()

CustomKeywords.'com.ii4usersites.HomePage.NavigateToPosTemplate'()

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnOrderNowButton'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.SetQuantity'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.AddItemToCart'()

CustomKeywords.'com.ii4usersites.ShoppingCartPage.ClickOnbottomCheckOutBtn'()

CustomKeywords.'com.ii4usersites.CheckOutPage.ClickOnContinueToReview'()

CustomKeywords.'com.ii4usersites.ReviewPage.ClickOnPlaceOrderBtn'()

CustomKeywords.'com.ii4usersites.MyDownloadsPage.ValidateOrder'()

