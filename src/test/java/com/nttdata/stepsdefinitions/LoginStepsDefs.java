package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepsDefs {

    @Steps
    LoginSteps loginSteps;
    @Given("que me enuentro en la pagina de login de Swaglabs con usuario standard")
    public void queMeEnuentroEnLaPaginaDeLoginDeSwaglabs() {
        loginSteps.clickUserStandard();
        loginSteps.clickLoginButton();
    }

    @Then("valido que deberia aparecer el titulo de {string}")
    public void validoQueDeberiaAparecerElTituloDe(String titulo) {
        Assert.assertEquals(loginSteps.getTitleText(), titulo);
    }

    @And("tambien valido que al menos exista un item")
    public void tambienValidoQueAlMenosExistaUnItem() {
        int items = loginSteps.getItemSize();
        Assert.assertTrue("El tamano de la lista es: "+items, items  > 0);
    }
}
