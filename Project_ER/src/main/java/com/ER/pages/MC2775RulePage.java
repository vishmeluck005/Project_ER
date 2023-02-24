package com.ER.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ER.base.TestBase;
import com.ER.util.TestUtil;

public class MC2775RulePage extends TestBase{
	
	@FindBy(xpath="//button[@id='NewRuleButton']")
	WebElement newRuleBtn;
	
	@FindBy(xpath="//div[@class='col-md-12']//input[@id='criterion']")
	WebElement selectCharacteristicsSearchBox; 
	
	@FindBy(xpath="//i[contains(@class,'fa fa-search')]")
	WebElement selectCharacteristicsSearchBtn;
	
	@FindBy(xpath="//span[@class='fancytree-title'][normalize-space()='User Id']")
	WebElement selectUserId;
	
	@FindBy(xpath="//span[@id='select2-selectedOperator-container']")
	WebElement selectOperatorDropDown;
	
	@FindBy(xpath="//option[text()='Equal to']")
	WebElement selectEqualToOption;
	
	@FindBy(xpath="//button[@id='showDialog_ruleExpressionPane1']")
	WebElement buildExpressionBtn;
	
	@FindBy(xpath="//textarea[@id='value1']")
	WebElement messageContentTextBox;
	
	@FindBy(xpath="(//button[text()='Done'])[1]")
	WebElement doneBtn;
	
	@FindBy(xpath="//button[@id='addSegment']")
	WebElement addSegmentBtn;
	
	@FindBy(xpath="//button[@id='saveCriteria']")
	WebElement saveAndNextBtn;
	
	@FindBy(xpath="//span[@id='select2-addNewRow_0-container']")
	WebElement questionSelectDropDown1;
	
	@FindBy(xpath="//input[@aria-label='Search']")
	WebElement SearchBox;
	
	@FindBy(xpath="//input[@id='0formula']")
	WebElement answerTextBox1;
	
	@FindBy(xpath="//span[@id='select2-addNewRow_1-container']")
	WebElement questionSelectDropDown2;
	
	@FindBy(xpath="//input[@id='1formula']")
	WebElement answerTextBox2;
	
	@FindBy(xpath="//span[@id='select2-addNewRow_2-container']")
	WebElement questionSelectDropDown3;
	
	@FindBy(xpath="//input[@id='2formula']")
	WebElement answerTextBox3;
	
	@FindBy(xpath="//button[@id='SaveRuleValue']")
	WebElement saveValueAndNextBtn;
	
	@FindBy(xpath="//input[@id='selectedFireIndex']")
	WebElement fireOrderTextBox;
	
	@FindBy(xpath="//td[@class='fireOrderEffDate']")
	WebElement fireOrderEffDate;
	
	@FindBy(xpath="//textarea[@id='comments']")
	WebElement commentsTextBox;
	
	@FindBy(xpath="//button[@id='submitForm_finish']")
	WebElement finishBtn;
	
	@FindBy(xpath="//button[normalize-space()='Commit Changes']")
	WebElement commitChangesBtn;
	
	@FindBy(xpath="//input[@placeholder='Rule Filter']")
	WebElement ruleFilterSearchBox;
	
	@FindBy(xpath="//tr[@class='NEWRULE']//span[@title=\"Equal to cscvishwanath\"]/../..//input[@type=\"checkbox\"]")
	WebElement ruleCheckBox;
	
	@FindBy(xpath="//a[@title=\"Edit\"]")
	WebElement ruleEditOption;
	
	@FindBy(xpath="//a[@id='deleteRow_0']//i[@class='fa fa-trash-o fa-lg']")
	WebElement deleteQuestionIcon;
	
	@FindBy(xpath="//span[@id='theError']")
	WebElement errorMessageForInvalidAnswer;
	
	@FindBy(xpath="//button[@data-value=\"Cancel\"]")
	WebElement cancelBtn;
	
	public MC2775RulePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewRule() throws  InterruptedException, AWTException {
		Thread.sleep(5000);
		newRuleBtn.click();
		selectCharacteristicsSearchBox.sendKeys("user id");
		selectCharacteristicsSearchBtn.click();
		selectUserId.click();
		selectOperatorDropDown.click();
		SearchBox.sendKeys("Equal to");
		TestUtil.pressEnter();
		buildExpressionBtn.click();
		messageContentTextBox.sendKeys("cscvishwanath");
		doneBtn.click();
		addSegmentBtn.click();
		saveAndNextBtn.click();
		questionSelectDropDown1.click();
		SearchBox.sendKeys("testm - ER58289");
		TestUtil.pressEnter();
		answerTextBox1.sendKeys("Test");
		questionSelectDropDown2.click();
		SearchBox.sendKeys("QA853 - QA For ER85363");
		TestUtil.pressEnter();
		answerTextBox2.sendKeys("Dollars");
		questionSelectDropDown3.click();
		SearchBox.sendKeys("SDA - Son date");
		TestUtil.pressEnter();
		answerTextBox3.sendKeys("10/11/2022");
		saveValueAndNextBtn.click();
		fireOrderTextBox.click();
		fireOrderTextBox.sendKeys("1");
		fireOrderEffDate.click();
		finishBtn.click();
		commentsTextBox.sendKeys("Training");
		commitChangesBtn.click();	
	}
	
	public void removeQAfromRule() throws AWTException {
		TestUtil.waitTillElementVisible(ruleFilterSearchBox);
		ruleFilterSearchBox.clear();
		ruleFilterSearchBox.sendKeys("cscvishwanath");
		TestUtil.pressEnter();
		TestUtil.waitTillElementVisible(ruleCheckBox);
		ruleCheckBox.click();
		TestUtil.waitTillElementVisible(ruleEditOption);
		TestUtil.moveToElementAndClick(ruleEditOption);
		saveAndNextBtn.click();
		deleteQuestionIcon.click();
		saveValueAndNextBtn.click();
		finishBtn.click();
		commitChangesBtn.click();
	}
	
	public void editQAforIllogicalAnswerFromRule() throws AWTException {
		TestUtil.waitTillElementVisible(ruleFilterSearchBox);
		ruleFilterSearchBox.clear();
		ruleFilterSearchBox.sendKeys("cscvishwanath");
		TestUtil.pressEnter();
		TestUtil.waitTillElementVisible(ruleCheckBox);
		ruleCheckBox.click();
		TestUtil.waitTillElementVisible(ruleEditOption);
		TestUtil.moveToElementAndClick(ruleEditOption);
		saveAndNextBtn.click();
		answerTextBox2.sendKeys("Dollars");
		saveValueAndNextBtn.click();
		TestUtil.validateDisplayed(errorMessageForInvalidAnswer);
		cancelBtn.click();
	}
}
