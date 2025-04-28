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
	private WebDriver driver;

	public LoginStepDefinition() {
		this.loginpage = new LoginPage();
		driver = Setup.getDriver();
	}

	@Given("Je me connecte sur l application   OrangeHRM")
	public void gotoURL() {
		loginpage.gotoURL();
	}

	@When("Je saisis {string} dans le champ Username")
	public void fillUsername(String username)  {
		
		loginpage.fillUsername(username);
	}

	@When("Je saisis {string} dans le champ Password")
	public void fillPWD(String password) {
		loginpage.fillPWD(password);
	}

	@When("Je clique sur le bouton Login")
	public void clickSubmitButton()  {
		wait.until(ExpectedConditions.elementToBeClickable(LoginPage.login));
		loginpage.clickSubmitButton();

	}

	@Then("Je devrais voir la page {string} de l application OrangeHRM")
	public void jeDevraisVoirLaPageDashboardDeLApplicationOrangeHRM(String title) {
	wait.until(ExpectedConditions.visibilityOf(LoginPage.titlePage));

		String title_Page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_Page, title);
		System.out.println("done");
	}

}
