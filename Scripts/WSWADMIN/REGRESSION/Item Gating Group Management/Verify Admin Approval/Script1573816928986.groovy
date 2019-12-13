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

/*WebUI.openBrowser('')

WebUI.maximizeWindow()*/

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamewswadmin, GlobalVariable.testtypesmoke,GlobalVariable.environment)
//Login to WSW admin
CustomKeywords.'com.wswadmin.LoginPage.WSWlogin'(GlobalVariable.wswadminusername, GlobalVariable.wswpassword)
//Navigate to Adminintrative Item Gating User Groups page
CustomKeywords.'com.wswadmin.HomePage.NavigateToItemGatingGroupManagementAdministrativeItemGating'()


//Select corporation from the drop down
CustomKeywords.'com.wswadmin.AdminItemGating.SelectCorporation'()
//Select distributor from the drop down
CustomKeywords.'com.wswadmin.AdminItemGating.SelectDistributor'()
//click on add/edit button
CustomKeywords.'com.wswadmin.AdminItemGating.ClickOnAddEditButton'()
//select admin approval and admin check box
CustomKeywords.'com.wswadmin.AdminItemGating.SelectAdminAndAdminApprovalCheckBox'()
//clcik on save btn
CustomKeywords.'com.wswadmin.AdminItemGating.ClickOnSaveBtn'()


CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameiiusersite, GlobalVariable.testtyperegression, GlobalVariable.environment)

CustomKeywords.'com.ii4usersites.LoginPage.LoginToDemoCorp'(GlobalVariable.iiusersiteusername, GlobalVariable.iiusersitepassword)

CustomKeywords.'com.ii4usersites.HomePage.ClickOnPosTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.SearchTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnAdminApprovalAndVerifyTemplate'()

CustomKeywords.'com.ii4usersites.ItemSearchPage.ClickOnApprovalAndVerifyTemplate'()
