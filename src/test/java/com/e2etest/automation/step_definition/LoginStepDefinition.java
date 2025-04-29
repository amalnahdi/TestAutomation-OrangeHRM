package com.e2etest.automation.step_definition;

import java.sql.Driver;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.BasePage;
import com.e2etest.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BasePage {

	WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(3));
	public LoginPage loginpage;
	//private WebDriver driver;

	public LoginStepDefinition() {
		this.loginpage = new LoginPage();
		//driver = Setup.getDriver();
	}

	 @Given("Je me connecte sur l application OrangeHRM")
	    public void jeMeConnecteSurLApplication() {
	        loginpage.gotoURL();
	    }

	    @When("Je saisis {string} dans le champ Username")
	    public void jeSaisisUsername(String user) {
	        loginpage.fillUsername(user);
	    }

	    @When("Je saisis {string} dans le champ Password")
	    public void jeSaisisPassword(String pwd) {
	        loginpage.fillPassword(pwd);
	    }

	    @When("Je clique sur le bouton Login")
	    public void jeCliqueSurLogin() {
	        loginpage.clickLogin();
	    }

	    @Then("Je devrais voir la page {string} de l application OrangeHRM")
	    public void jeVoisLaPage(String title) {
	        Assert.assertTrue("Page title mismatch",
	            loginpage.getDashboardTitle().equalsIgnoreCase(title));
	    }
}
