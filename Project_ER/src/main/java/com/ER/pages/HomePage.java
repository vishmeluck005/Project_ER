package com.ER.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ER.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='criterion']")
	WebElement configSearchBox;
	
	@FindBy(xpath="//i[@class='glyphicon glyphicon-search']")
	WebElement configSearchBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public MC2773RulePage navigateToMC2773() {
		configSearchBox.sendKeys("MC2773");
		configSearchBtn.click();
		return new MC2773RulePage();
	}
	
	public MC2774RulePage navigateToMC2774() {
		configSearchBox.sendKeys("MC2774");
		configSearchBtn.click();
		return new MC2774RulePage();
	}
	
	public MC2775RulePage navigateToMC2775() {
		configSearchBox.sendKeys("MC2775");
		configSearchBtn.click();
		return new MC2775RulePage(); 
	}
	
	public MC3112RulePage navigateToMC3112() {
		configSearchBox.sendKeys("MC3112");
		configSearchBtn.click();
		return new MC3112RulePage();
	}
	
	public MC3254RulePage navigateToMC3254() {
		configSearchBox.sendKeys("MC3254");
		configSearchBtn.click();
		return new MC3254RulePage();
	}
	
	public MC3255RulePage navigateToMC3255() {
		configSearchBox.sendKeys("MC3255");
		configSearchBtn.click();
		return new MC3255RulePage();
	}
	
	public MC3256RulePage navigateToMC3256() {
		configSearchBox.sendKeys("MC3256");
		configSearchBtn.click();
		return new MC3256RulePage();
	}
	
	public MC3257RulePage navigateToMC3257() {
		configSearchBox.sendKeys("MC3257");
		configSearchBtn.click();
		return new MC3257RulePage();
	}
	
	public MC3679RulePage navigateToMC3679() {
		configSearchBox.sendKeys("MC3679");
		configSearchBtn.click();
		return new MC3679RulePage();
	}
	
	public MC3856RulePage navigateToMC3856() {
		configSearchBox.sendKeys("MC3856");
		configSearchBtn.click();
		return new MC3856RulePage();
	}

}
