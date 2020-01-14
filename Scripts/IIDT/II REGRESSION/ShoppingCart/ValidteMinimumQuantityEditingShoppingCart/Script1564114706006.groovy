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

WebUI.waitForPageLoad(300)

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.wswadmin.HomePage.NavigateToItemPartQntyMaintenance'()

CustomKeywords.'com.wswadmin.ItemPartQntyMaintenance.ValidatePart'()

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToDemoCorp'(GlobalVariable.iiusersiteusername, GlobalVariable.iiusersitepassword)

CustomKeywords.'com.ii4usersites.HomePage.VerifyHomePage'()

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnTestTemplate'("130718")

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnCreateYourOwnDesignAndNavigateToCreateDesignPage'()

CustomKeywords.'com.ii4usersites.CreateDesignPage.ClickOnPreviewChangesButton'()

CustomKeywords.'com.ii4usersites.CreateDesignPage.ClickOnNextStepBtnAndNavigateToProductSelectionPage'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.SelectItemType'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.SetQuantity'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.ClickOnNo'()

CustomKeywords.'com.ii4usersites.ProductionSelectionPage.ClickOnAddToKart'()

CustomKeywords.'com.ii4usersites.ShoppingCartPage.ClearShoppingCart'()