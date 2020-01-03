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
// Login to wsw adming 
CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtypesmoke, GlobalVariable.environment)
// Login to wsw adming
CustomKeywords.'com.wswadmin.LoginPage.WSWlogin'(GlobalVariable.wswadminusername, GlobalVariable.wswpassword)
//click on OLOF ii4 configuration
CustomKeywords.'com.wswadmin.HomePage.ClickOnOLOFII4Configuration'()
//select copr and market
CustomKeywords.'com.wswadmin.II4ConfigurationPage.SelectIICorpAndMarkets'()
//Enable/disable price disclaimer config
String Disclaimer = CustomKeywords.'com.wswadmin.II4ConfigurationPage.EnableAndDisablePriceDisclaimer'("Enable")
//login to ii4 app
CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToInstantImpactDist'("testadmin1@brandmuscle.com" , "go2web")
//click on order form menu
CustomKeywords.'com.ii4usersites.HomePage.ClickOnOrderForm'()
//click on new custom order order icon
CustomKeywords.'com.ii4usersites.OrderFormDefaultPage.ClickonCreateNewCustomOrder'()
//fill all mandatory fields
CustomKeywords.'com.ii4usersites.OrderFormOrderHederPage.EnterValuesToFiledsInOrderPage'()
//click on small print icon
CustomKeywords.'com.ii4usersites.OrderFormItemDetails1Page.ClickOnSmallPrintBtn'()
//fill/ select all mandatory fields
CustomKeywords.'com.ii4usersites.OrderFormPrintDetails1Page.EnterAllVauesInPrintDetails1Page'()

//CustomKeywords.'com.ii4usersites.OrderFormPrintDetails2Page.EnterQty'()

//add test notes on note text field
CustomKeywords.'com.ii4usersites.OrderFormPrintDetails2Page.AddNotes'()
//click on next btn
CustomKeywords.'com.ii4usersites.OrderFormPrintDetails2Page.ClickOnNextBtn'()
//click on NO brand mention header
CustomKeywords.'com.ii4usersites.OrderFormBrandMentionPage.ClickOnNoBrandmentionAndClickonNextBtn'()
//click to continue to Order summary btn
CustomKeywords.'com.ii4usersites.OnlineOrderFormItemDetailsPage.ClickOnContinuetoOrderSummaryBtn'()
// verify the price disclaimer text msg
CustomKeywords.'com.ii4usersites.OrderFormOrderSumaryPage.VerifyPriceDisclaimerMsg'(Disclaimer)
