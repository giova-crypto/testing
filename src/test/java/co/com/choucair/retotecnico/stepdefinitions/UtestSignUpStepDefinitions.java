package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.model.Marcus;
import co.com.choucair.retotecnico.tasks.OpenUp;
import co.com.choucair.retotecnico.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestSignUpStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that marcus wants to sign up in the utest page$")
    public void thatMarcusWantsToSignUpInTheUtestPage() {
        OnStage.theActorCalled("marcus").wasAbleTo(OpenUp.thePage());
    }

    @When("^he submit the full form$")
    public void heSubmitTheFullForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.theForm());
    }

    @Then("^he is ready to verify their email$")
    public void heIsReadyToVerifyTheirEmail() {

    }

}
