import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import internal.GlobalVariable

CustomKeywords.'com.utilities.Interaction.GetUrl'(GlobalVariable.bunameapprovals, GlobalVariable.testtypesmoke, GlobalVariable.environment)

CustomKeywords.'com.approvals.LoginPage.VerifyApprovalLoginPage'()

CustomKeywords.'com.approvals.LoginPage.ApprovalLogin'(GlobalVariable.approvalusername, GlobalVariable.approvalpassword)

CustomKeywords.'com.approvals.HomePage.VerifyApprovalHomePage'()

CustomKeywords.'com.approvals.HomePage.ClickOnReportsButton'()

CustomKeywords.'com.approvals.Reports.VerifyReportsPage'()

CustomKeywords.'com.approvals.Reports.VerifyAvailableReport'()
