package com.e2etest.automation.step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etest.automation.page_objects.BuzzPage;
import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {

   // private BuzzPage buzzPage = new BuzzPage();
 
    
    WebDriver driver = Setup.getDriver();
    BuzzPage buzzPage = new BuzzPage(driver);
    // Matches: And Je clique sur le bouton "Buzz"  or "Post"
    @When("Je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String label) {
        switch(label) {
            case "Buzz":
                buzzPage.clickBuzz();
                break;
            case "Post":
                buzzPage.clickPost();
                break;
            default:
                throw new IllegalArgumentException("Bouton inconnu: " + label);
        }
    }

    // Matches: When Je clique sur le champ "What’s on your mind?"
    @When("Je clique sur le champ {string}")
    public void jeCliqueSurLeChamp(String placeholderText) {
        buzzPage.clickInputField();
    }

    // Matches: And Je saisis "Hello world"
    @When("Je saisis {string}")
    public void jeSaisis(String msg) {
        buzzPage.enterMessage(msg);
    }

    // Matches: Then Je devrais voir une popup "Successfully Saved"
    @Then("Je devrais voir une popup {string}")
    public void jeVoisPopup(String expectedText) {
        Assert.assertTrue("Le toast de succès n'est pas affiché",
            buzzPage.isSuccessToastDisplayed());
    }
}