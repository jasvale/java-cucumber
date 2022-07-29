package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PiratesScenarioStepDefinitions {

    Pirate captain;
    Ship ship;

    @Given("a pirate named {pirate}")
    public void aPirateBlackbeard(Pirate pirate) {
        this.captain = pirate;
    }

    @And("a ship called {ship}")
    public void aShipQueenAnneSRevenge(Ship ship) {
        this.ship = ship;
    }

    @Then("the captain is with his ship")
    public void bothMustExist() {
        assertTrue(Objects.nonNull(captain) && Objects.nonNull(ship));
    }

    @When("there no one displeased onboard")
    public void thereNoOneDispleasedOnboard() {
        assertFalse(ship.anyDispleasedPrivateers());
    }

    @Then("the captain is respected")
    public void theCaptainIsRespected() {
        assertTrue(captain.respected());
    }

    @Then("sails")
    public void sails() {
        assertTrue(ship.sails());
    }
}
