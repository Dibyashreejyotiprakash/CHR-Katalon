import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import internal.GlobalVariable

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunamedesigntracker, GlobalVariable.testtyperegression,
	GlobalVariable.environment)

CustomKeywords.'com.designtracker.LoginPage.LoginToDesignTarcker'(GlobalVariable.dtusername, GlobalVariable.dtpassowrd)

CustomKeywords.'com.designtracker.HomePage.VerifyHomePage'()

CustomKeywords.'com.designtracker.HomePage.ClickOnNewJob'()

CustomKeywords.'com.designtracker.JobNewPage.VerifyNewJobPage'()

String dtjob = CustomKeywords.'com.designtracker.JobNewPage.CreateNewJob'()

CustomKeywords.'com.designtracker.HomePage.DTLogOut'()

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovals, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.approvals.LoginPage.VerifyApprovalLoginPage'()

CustomKeywords.'com.approvals.LoginPage.ApprovalLogin'(GlobalVariable.approvalusername, GlobalVariable.approvalpassword)

CustomKeywords.'com.approvals.HomePage.VerifyApprovalHomePage'()

CustomKeywords.'com.approvals.HomePage.VerifySearchByDTJob'(dtjob)

CustomKeywords.'com.approvals.HomePage.VerifyCreatedJobDetails'()






