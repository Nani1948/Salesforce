package com.automation.pages.randomscenario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class CalendarNewEvent extends BasePage{
    @FindBy(css="img[title='Subject Combo (New Window)']")WebElement subjectCombo;
    @FindBy(css="a[href='javascript:pickValue(4);']")WebElement   otherslink;
    @FindBy(xpath="//input[@id='EndDateTime_time']")WebElement   endTime;
    @FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")WebElement saveButton;
    @FindBy(xpath="//input[@id='EndDateTime_time']")WebElement   endTime1;
    @FindBy(xpath="//input[@id='IsRecurrence']")WebElement  recurrence;
    @FindBy(xpath="//*[@id='rectypeftw']")WebElement       weeklyRadioButton;
    @FindBy(xpath="//input[@id='RecurrenceEndDateOnly']")WebElement   recurrenceEndDate;
    @FindBy(xpath = "//div[@class='datePicker']") private WebElement calendar;
 // Step 2: Locate and click on the desired day on the calendar
    @FindBy(xpath = ".//td[text()='15']")  WebElement desiredDay;
	public CalendarNewEvent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   public void clickOnSubjectCombo(String text) {
    	waitForElementToBeVisible(driver,  subjectCombo, 40, text);
        moveToElementAction(driver,  subjectCombo,  text);
    }
   public void switchToWindow() {
	   // Get the window handle of the main window
       String mainWindowHandle = driver.getWindowHandle();

       // Switch to the new window (pop-up window)
       for (String handle : driver.getWindowHandles()) {
           if (!handle.equals(mainWindowHandle)) {
               driver.switchTo().window(handle);
               break;
           }
       }
       String popupWindowTitle = driver.getTitle();
       System.out.println("Popup Window Title: " + popupWindowTitle);
	    
	    }
   public void switchToWindowByTitle(String windowTitle) {
	  // String mainWindow=driver.getWindowHandle();
	   Set<String> childWindow=driver.getWindowHandles();
	    for (String windowHandle : childWindow) {
	        driver.switchTo().window(windowHandle);
	        log.info("Switch from mainWinodow to childWindow");
	        if (driver.getTitle().equals(windowTitle)) {
	          break;
	        }
	    }
   }
   
   public void switchToMainWindow() {
	   switchToDefaultWindow();
   }
   public void clickOnOthers(String text) {
	   waitForElementToBeVisible(driver, otherslink, 40, text);
       moveToElementAction(driver, otherslink,  text);
   }
   public void selectOptionFromEndTime(String text) {
	   waitForElementToBeVisible(driver, recurrence, 40, text);
	   clickElement(driver, endTime, text);
	   selectByValueOfElement(endTime, text);	    
   }
   public void selectOptionFromEndTime1(String text) {
	   clickElement(driver, endTime1, text);
	   selectByValueOfElement(endTime1, text);	    
   }
   public void clickOnSaveButton(String text) {
   	
       moveToElementAction(driver,  saveButton,  text);
   }
   public void maximizedWindow() {
	   driver.manage().window().maximize();
   }
   public void isRecurrenceCheck() {

	   isChecked(recurrence, false);
	
   }
   public void   isWeeklySelected(String text) {
	   selectRadioButton( weeklyRadioButton,text);
   }
   public void enterRecurrenceEndDate(String text) {
	  clickElement(driver, recurrenceEndDate, text); 
   }
   }

