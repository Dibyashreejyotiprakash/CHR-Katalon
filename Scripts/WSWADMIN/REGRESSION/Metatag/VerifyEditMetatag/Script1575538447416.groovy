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


CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtyperegression,GlobalVariable.environment)

CustomKeywords.'com.wswadmin.LoginPage.VerifyLoginPage'()

CustomKeywords.'com.wswadmin.LoginPage.WSWlogin'(GlobalVariable.wswadminusername, GlobalVariable.wswpassword)

CustomKeywords.'com.wswadmin.HomePage.NavigateToMetaTaggingCategoryItemMaintenancePage'()

CustomKeywords.'com.wswadmin.CategoryItemMaintenancePage.VerifyCategryMaintenancePage'()

String newlycreatedmetatagname = CustomKeywords.'com.wswadmin.CategoryItemMaintenancePage.CreateMetatag'()

CustomKeywords.'com.wswadmin.HomePage.NavigateToItemSearchTaggingPage'()

CustomKeywords.'com.wswadmin.TemplateFulfillmentPage.VerifyTemplateFulfillmentPage'()

CustomKeywords.'com.wswadmin.TemplateFulfillmentPage.SelectCompleteTemplate'()

CustomKeywords.'com.wswadmin.MetatagConfigurationPage.VerifyMetatagConfigurationPage'()

CustomKeywords.'com.wswadmin.MetatagConfigurationPage.VerifyNewlyCreatedMetatag'(newlycreatedmetatagname)

CustomKeywords.'com.wswadmin.HomePage.NavigateToMetaTaggingEditDeletePage'()

CustomKeywords.'com.wswadmin.CategoryItemEditAndDeletePage.VerifyCategoryItemEditDeletePage'()

CustomKeywords.'com.wswadmin.CategoryItemEditAndDeletePage.EditMetatag'(newlycreatedmetatagname)


