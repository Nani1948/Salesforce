package com.automation.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class ForgotYourPasswordPage extends BasePage{
	@FindBy(xpath="//a[contains(text(),'Forgot Your Password?')]")WebElement forgotPasswordlink;
	@FindBy(xpath="//*[@id='un']")WebElement usernameOnForgotPasswordLink;
	@FindBy(xpath="//input[@type='submit']")WebElement continueButton;
	
	public ForgotYourPasswordPage(WebDriver driver) {
		super(driver);
		
	}
	public void  clickOnForgotPassword() {
		moveToElementAction(driver,forgotPasswordlink,"Forgot Password Link");
	}
	public void enterUsernameOnForgotPasswordLink(String usernameData) {
		clearElement(usernameOnForgotPasswordLink, "Username  field");
		enterText(usernameOnForgotPasswordLink, usernameData, "Username field");
	}
	public void clickOnContinueButton() {
		moveToElementAction(driver,continueButton,"Continue Button");
	}
    public String getTitleOfForgotPasswordPage1() {
    	return getPageTitle();
    }
	
   
}


