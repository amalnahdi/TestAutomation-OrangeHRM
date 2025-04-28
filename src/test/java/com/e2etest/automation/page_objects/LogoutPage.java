package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;

public class LogoutPage { 
	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(3));
	@FindBy(how = How.XPATH , using ="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
public static WebElement dropdownButton ;
	
	@FindBy(how = How.XPATH , using = "//a[normalize-space()='Logout']")
	public static WebElement logout ;
	@FindBy( how = How.XPATH , using = "//h5[normalize-space()='Login']")
	public  static  WebElement LoginTitle ; 
	

    public LogoutPage() {
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void clickUserDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(dropdownButton));
        dropdownButton.click();
    }

    public void clickLogoutOption() {
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        logout.click();
    }

    public boolean isLoginPageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(LoginTitle));
        return LoginTitle.isDisplayed();
    }

    

}
