package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SailorFunStepDefinitions {

    Sailor sailor;

    @Given("{sailor} is reading a book in the shade")
    public void peter_is_reading_a_book(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.READING_BOOKS);
    }

    @Then("he/she is satisfied.")
    public void peter_is_satisfied() {
        assertEquals(SailorStateOfMind.SATISFIED, sailor.getStateOfMind());
    }

    @Given("{sailor} is inside a big boat and a float, he fears nothing.")
    public void maryIsInsideABigBoatAndAFloatHeFearsNothing(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.SEEN_SHARK);
    }

    @Given("{sailor}, by the corner of eye, sees a shade passing, fast, bellow the boat.")
    public void jonnyByTheCornerOfEyeSeesAShadePassingFastTheDownBoat(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.CONFIRMED_KRAKEN);
    }

    @Then("he/she dead.")
    public void heDead() {
        assertEquals(SailorStateOfMind.TERRIFIED, sailor.getStateOfMind());
    }


    @Given("{sailor}, is still navigating even without sail or engines and with a hole in the hull.")
    public void aliciaIsStillNavigating(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.DEAD);
    }

    @Then("she is a ghost.")
    public void sheIsAGhost() {
        assertEquals(SailorStateOfMind.GHOST, sailor.getStateOfMind());
    }
}
