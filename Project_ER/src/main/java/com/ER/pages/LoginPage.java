package com.ER.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ER.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR(Object Repository)
	@FindBy(xpath="//input[@placeholder='User Id']")
	WebElement userId;
	
	@FindBy(xpath="//input[@id='j_password']")
	WebElement password;
	
	@FindBy(xpath="//button[@id='buttonCell']")
	WebElement loginBtn;
	
	//Initializing the Page Objects;
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public HomePage login(String un, String pwd) throws InterruptedException {
		userId.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(1000);
		return new HomePage();
	}
	

}
