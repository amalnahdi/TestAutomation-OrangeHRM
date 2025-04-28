package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;


public class BuzzPage {
	   public BuzzPage() {
	        PageFactory.initElements(Setup.getDriver(), this);
	    }
	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(3));
	
	@FindBy(xpath = "//h6[contains(@class, 'oxd-topbar-header-breadcrumb-module')]")
	public static WebElement buzzTitle;
	@FindBy( how= How.XPATH , using ="//a[@class='oxd-main-menu-item active']")
	public static WebElement buzz  ;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
    public static WebElement input;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement button;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'oxd-toast--success')]")
    public static WebElement toastSuccess;
	
    
    public void clickBuzz() {
        wait.until(ExpectedConditions.elementToBeClickable(buzz));
        buzz.click();

	}
    public void gotoURL () {
		Setup.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz");
		}
public  boolean pageBuzz (String name ) {
    wait.until(ExpectedConditions.visibilityOf(buzzTitle));
    return buzzTitle.isDisplayed();
}
    public void waitChamp() {
        wait.until(ExpectedConditions.visibilityOf(input));
    }

    public void saisirMessage(String message) {
    	waitChamp();
        input.sendKeys(message);
    }

    public void cliquerSurPost() {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }

    public boolean verifierPopupSuccess() {
        return wait.until(ExpectedConditions.visibilityOf(toastSuccess)).isDisplayed();
    }

    public boolean verifierTitrePage(String expectedTitle) {
        wait.until(ExpectedConditions.visibilityOf(buzzTitle));
        return buzzTitle.getText().equalsIgnoreCase(expectedTitle);
    }
}