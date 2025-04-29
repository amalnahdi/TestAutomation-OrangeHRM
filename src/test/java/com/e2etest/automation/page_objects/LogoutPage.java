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
	  @FindBy(xpath="//img[@alt='profile picture']") WebElement userMenu;
	  @FindBy(xpath="//a[text()='Logout']")      WebElement logoutLink;
	  @FindBy(name="username")                  WebElement loginField;
	  WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(3));

	  public LogoutPage() { PageFactory.initElements(Setup.getDriver(), this); }

	  public boolean isOnDashboard(String title) {
	    return Setup.getDriver().getTitle().contains(title);
	  }

	  public void clickUserDropdown() {
	    wait.until(ExpectedConditions.elementToBeClickable(userMenu)).click();
	  }

	  public void clickLogoutOption(String option) {
	    wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
	  }

	  public boolean isLoginPageDisplayed() {
	    return wait.until(ExpectedConditions.visibilityOf(loginField)).isDisplayed();
	  }
	}

