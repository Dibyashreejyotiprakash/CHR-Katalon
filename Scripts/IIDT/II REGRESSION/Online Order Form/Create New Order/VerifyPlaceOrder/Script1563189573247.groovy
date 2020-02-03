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

CustomKeywords.'com.ii4usersites.LoginPage.LoginToDemoCorp'(GlobalVariable.iiusersiteusername, GlobalVariable.iiusersitepassword)

CustomKeywords.'com.ii4usersites.HomePage.ClickOnOrderForm'()

CustomKeywords.'com.ii4usersites.OrderFormDefaultPage.ClickonCreateNewCustomOrder'()

CustomKeywords.'com.ii4usersites.OrderFormOrderHederPage.EnterValuesToFiledsInOrderPage'()

CustomKeywords.'com.ii4usersites.OrderFormItemDetails1Page.ClickOnMenuBookBtn'()

CustomKeywords.'com.ii4usersites.OrderFormMenuBookDetailsPage.EnterValuesToJobDetailspage'()

CustomKeywords.'com.ii4usersites.OrderFormItemDetails2Page.AddNewNoteAndClickOnNextBtn1'()

CustomKeywords.'com.ii4usersites.OrderFormBrandMentionPage.ClickOnNoBrandmentionAndClickonNextBtn'()

CustomKeywords.'com.ii4usersites.OrderFormShiipingDetailsPage.ClickOnNextBtn'()

CustomKeywords.'com.ii4usersites.OrderFormItemDetails1Page.ClickOnNextBtn'()

CustomKeywords.'com.ii4usersites.OrderFormOrderSumaryPage.PlaceOrder'()


