package com.e2etest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.utils.Setup;
public class LoginPage {

	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(3));

	@FindBy(how = How.NAME , using = "username" )
	public static  WebElement username;
	@FindBy(how = How.NAME , using = "password")
	public static WebElement password ; 
	@FindBy( how= How.XPATH , using ="//button[@type='submit']")
	public static WebElement login ; 
	@FindBy( how= How.XPATH , using ="//h6[normalize-space()='Dashboard']")
	public static WebElement titlePage ; 
	@FindBy( how= How.XPATH , using ="//a[@class='oxd-main-menu-item active']")
	public static WebElement buzz  ;
	
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void gotoURL () {
		Setup.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

	public  void fillUsername (String name ) {
        wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys(name);
	}
	public void fillPWD (String pwd) {
        wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys(pwd);
	}
	public void clickSubmitButton ()  {
		/*Thread.sleep(3000);
		login.click();*/
        wait.until(ExpectedConditions.elementToBeClickable(login));
		/*JavascriptExecutor js = (JavascriptExecutor) Setup.getDriver() ; 
		js.executeScript("arguments[0].click();", login);*/
        login.click();
	}
	
	public void clickBuzz() {
        wait.until(ExpectedConditions.elementToBeClickable(buzz));
        buzz.click();

	}
	
	
	
	
}
