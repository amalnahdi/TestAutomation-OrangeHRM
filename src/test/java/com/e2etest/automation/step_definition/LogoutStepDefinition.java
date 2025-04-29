package com.e2etest.automation.step_definition;

import java.time.Duration;

import org.junit.Assert;
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

@Given("Je suis connectee et sur la page {string}")
public void onDashboard(String title) {
  Assert.assertTrue(logoutpage.isOnDashboard(title));
}

@When("Je clique sur le menu utilisateur")
public void openUserMenu() {
  logoutpage.clickUserDropdown();
}

@When("Je selectionne l option {string}")
public void chooseLogout(String option) {
  logoutpage.clickLogoutOption(option);
}

@Then("Je suis redirigee vers la page de login")
public void verifyLoginPage() {
  Assert.assertTrue(logoutpage.isLoginPageDisplayed());
}

 }
 




