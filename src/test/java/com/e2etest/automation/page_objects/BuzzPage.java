package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;


public class BuzzPage {
	private WebDriver driver;
	 

    @FindBy(xpath = "//span[normalize-space()='Buzz']")
    private WebElement buzzTab;

    @FindBy(xpath = "//textarea[contains(@placeholder,'mind')]")
    private WebElement input;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement postBtn;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
  
    private WebElement toastMessage;

    private WebDriverWait wait =
        new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(5));

    
    public BuzzPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(Setup.getDriver(), this); 
    }
    
    
    public BuzzPage() {
        PageFactory.initElements(Setup.getDriver(), this);
    }

    public void clickBuzz() {
        wait.until(ExpectedConditions
          .elementToBeClickable(buzzTab)).click();
    }

    public void clickInputField() {
        wait.until(ExpectedConditions
          .elementToBeClickable(input)).click();
    }

    public void enterMessage(String msg) {
        input.sendKeys(msg);
    }

    public void clickPost() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement postButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        postButton.click();
    }

    public boolean isSuccessToastDisplayed() {
        // Wait for the <p> text to appear
        return wait.until(ExpectedConditions
          .visibilityOf(toastMessage))
          .isDisplayed();
    }
}