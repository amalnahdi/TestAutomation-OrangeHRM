package com.e2etest.automation.step_definition;

import org.junit.Assert;

import com.e2etest.automation.page_objects.BuzzPage;
import com.e2etest.automation.page_objects.LoginPage;
import com.e2etest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {

	BuzzPage buzzPage = new BuzzPage();

    @Given("Je suis sur  la page {string}")
    public void jeSuisSurLaPage(String expectedTitle) {
        buzzPage.gotoURL(); 
        Assert.assertTrue("Le titre de la page n'est pas correct", buzzPage.verifierTitrePage(expectedTitle));
    }

    @When("Je clique sur  {string} field")
    public void jeCliqueSurField(String field) {
        buzzPage.waitChamp(); 
    }

    @When("Je saisie {string}")
    public void jeSaisie(String message) {
        buzzPage.saisirMessage(message);
    }

    @When("Je clique sur le bouton {string}")
    public void jeCliqueSurLeBouton(String bouton) {
        buzzPage.cliquerSurPost();
    }

    @Then("Je devrais voir une popup {string}")
    public void jeDevraisVoirUnePopup(String popupText) {
        Assert.assertTrue("La popup de succès n'est pas affichée", buzzPage.verifierPopupSuccess());
    }
}