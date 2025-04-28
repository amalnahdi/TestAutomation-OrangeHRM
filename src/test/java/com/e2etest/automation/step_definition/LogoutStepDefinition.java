package com.e2etest.automation.step_definition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.page_objects.LogoutPage;
import com.e2etest.automation.utils.BasePage;
import com.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition extends BasePage {
	
	WebDriverWait wait  =  new WebDriverWait(Setup.getDriver() , Duration.ofSeconds(3)); 
	public LogoutPage logoutpage ; 
	private WebDriver driver ;
 public LogoutStepDefinition () {
	 this.logoutpage = new LogoutPage() ; 
	 driver = Setup.getDriver();
 }


 @Given("Je suis connecté et sur la page {string}")
 public void jeSuisConnectéEtSurLaPage(String string) {
 }
 @When("Je clique sur le bouton du menu déroulant dans le coin supérieur droit")
 public void clickUserDropdown() {
    
 }
 @When("Je sélectionne l option {string}")
 public void clickLogoutOption(String string) {

 }
 @Then("Je suis redirigé vers la page de login")
 public void isLoginPageDisplayed() {

 }
 



}
