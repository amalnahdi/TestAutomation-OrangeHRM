package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.ConfigFileReader;
import com.e2etest.automation.utils.Setup;
public class LoginPage {
    @FindBy(name="username")  private WebElement username;
    @FindBy(name="password")  private WebElement password;
    @FindBy(xpath="//button[@type='submit']") private WebElement loginBtn;
    @FindBy(xpath="//h6[normalize-space()='Dashboard']") private WebElement dashboardTitle;

    private WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(5));
    private String url = new ConfigFileReader().getProperties("home.url");

    public LoginPage() {
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void gotoURL() {
        Setup.getDriver().get(url);
    }

    public void fillUsername(String u) {
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(u);
    }
    public void fillPassword(String p) {
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(p);
    }
    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
    public String getDashboardTitle() {
        return wait.until(ExpectedConditions.visibilityOf(dashboardTitle)).getText();
    }
	
	
}
