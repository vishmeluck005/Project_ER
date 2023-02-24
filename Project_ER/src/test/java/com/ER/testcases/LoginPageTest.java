package com.ER.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ER.base.TestBase;
import com.ER.pages.HomePage;
import com.ER.pages.LoginPage;
import com.ER.pages.MC2773RulePage;
import com.ER.pages.MC2774RulePage;
import com.ER.pages.MC2775RulePage;
import com.ER.pages.MC3112RulePage;
import com.ER.pages.MC3254RulePage;
import com.ER.pages.MC3255RulePage;
import com.ER.pages.MC3256RulePage;
import com.ER.pages.MC3257RulePage;
import com.ER.pages.MC3679RulePage;
import com.ER.pages.MC3856RulePage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	MC2773RulePage mc2773RulePage;
	MC2774RulePage mc2774RulePage;
	MC2775RulePage mc2775RulePage;
	MC3112RulePage mc3112RulePage;
	MC3254RulePage mc3254RulePage;
	MC3255RulePage mc3255RulePage;
	MC3256RulePage mc3256RulePage;
	MC3257RulePage mc3257RulePage;
	MC3679RulePage mc3679RulePage;
	MC3856RulePage mc3856RulePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginTest() throws InterruptedException, AWTException {
		homePage=loginPage.login("cscvishwanath","Iam$uccessfulinthisproject05");
		mc2773RulePage=homePage.navigateToMC2773();
		mc2773RulePage.createNewRule();
		mc2773RulePage.removeQAfromRule();
		mc2773RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc2774RulePage=homePage.navigateToMC2774();
		mc2774RulePage.createNewRule();
		mc2774RulePage.removeQAfromRule();
		mc2774RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc2775RulePage=homePage.navigateToMC2775();
		mc2775RulePage.createNewRule();
		mc2775RulePage.removeQAfromRule();
		mc2775RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3112RulePage=homePage.navigateToMC3112();
		mc3112RulePage.createNewRule();
		mc3112RulePage.removeQAfromRule();
		mc3112RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3254RulePage=homePage.navigateToMC3254();
		mc3254RulePage.createNewRule();
		mc3254RulePage.removeQAfromRule();
		mc3254RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3255RulePage=homePage.navigateToMC3255();
		mc3255RulePage.createNewRule();
		mc3255RulePage.removeQAfromRule();
		mc3255RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3256RulePage=homePage.navigateToMC3256();
		mc3256RulePage.createNewRule();
		mc3256RulePage.removeQAfromRule();
		mc3256RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3257RulePage=homePage.navigateToMC3257();
		mc3257RulePage.createNewRule();
		mc3257RulePage.removeQAfromRule();
		mc3257RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3679RulePage=homePage.navigateToMC3679();
		mc3679RulePage.createNewRule();
		mc3679RulePage.removeQAfromRule();
		mc3679RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
		mc3856RulePage=homePage.navigateToMC3856();
		mc3856RulePage.createNewRule();
		mc3856RulePage.removeQAfromRule();
		mc3856RulePage.editQAforIllogicalAnswerFromRule();
		Thread.sleep(10000);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
