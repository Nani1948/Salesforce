package com.automation.pages.randomscenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class HomeTabPage extends BasePage{

	@FindBy(xpath="//*[@id='ptBody']/div/div[2]/span[2]/a")WebElement  dateandTimeLink;
	@FindBy(xpath="//a[normalize-space()='8:00 PM']")WebElement  eightPMLink;
	@FindBy(xpath="//a[normalize-space()='4:00 PM']")WebElement  fourPMLink;
	@FindBy(xpath="//title[contains(text(),'Salesforce - Developer Edition')]") WebElement redirectingPageToHomeTabPage;
	@FindBy(xpath="//title[contains(text(),'Calendar for nandhini Lalala ~ Salesforce - Developer Edition')]") WebElement redirectingToCalendarPage;
	@FindBy(xpath="//title[contains(text(),'Calendar: New Event ~ Salesforce - Developer Edition')]") WebElement redirectingToCalendarNewEventPage;
	@FindBy(xpath="//img[@title='Month View']")WebElement monthView;
	public HomeTabPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    public void clickOnDateAndTime(String text) {
    	
        moveToElementAction(driver,dateandTimeLink,  text);
    }
   
    public void clickOneightPMLink(String text) {
    	waitForElementToBeVisible(driver,  eightPMLink, 40, text);
        moveToElementAction(driver,  eightPMLink,  text);
    }
    public void clickOnFourPMLink(String text) {
    	waitForElementToBeVisible(driver,  fourPMLink, 40, text);
        moveToElementAction(driver,  fourPMLink,  text);
    }
    public void getTitleOfHomeTabsPage() {

    	if (redirectingPageToHomeTabPage.isDisplayed()) {
    	    System.out.println("Successfully redirected to the same page with the new heading: " +redirectingPageToHomeTabPage.getText());
    	} else {
    	    System.out.println("Redirection to the same page failed.");
    	}

    }
    public void getTitleOfCalendarPage() {

       	if (redirectingToCalendarPage.isDisplayed()) {
       	    System.out.println("Successfully redirected to the same page with the new heading: " +redirectingToCalendarPage.getText());
       	} else {
       	    System.out.println("Redirection to the same page failed.");
       	}
    }
    public void getTitleOfCalendarNewEventPage() {

       	if (redirectingToCalendarNewEventPage.isDisplayed()) {
       	    System.out.println("Successfully redirected to the same page with the new heading: " +redirectingToCalendarNewEventPage.getText());
       	} else {
       	    System.out.println("Redirection to the same page failed.");
       	}
    }
    public void clickOnMonthView(String text) {
    	waitForElementToBeVisible(driver,   monthView, 40, text);
        moveToElementAction(driver, monthView,  text);
    }
}
