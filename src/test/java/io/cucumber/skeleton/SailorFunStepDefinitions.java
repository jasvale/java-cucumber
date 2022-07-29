package io.cucumber.skeleton;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SailorFunStepDefinitions {

    BottomOfSea bottomOfSea;
    Sailor sailor;

    @Given("{sailor} is reading a book in the shade")
    public void peterIsReadingABook(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.READING_BOOKS);
    }

    @Then("he/she is satisfied.")
    public void peterIsSatisfied() {
        assertEquals(SailorState.SATISFIED, sailor.getSailorState());
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
        assertEquals(SailorState.TERRIFIED, sailor.getSailorState());
    }


    @Given("{sailor}, is still navigating even without sail or engines and with a hole in the hull.")
    public void aliciaIsStillNavigating(Sailor sailor) {
        this.sailor = sailor;
        sailor.computeStateOfMind(SailorAction.DEAD);
    }

    @Then("she is a ghost.")
    public void sheIsAGhost() {
        assertEquals(SailorState.GHOST, sailor.getSailorState());
    }



    public static class PirateAndShip {

        private final String name;
        private final String ship;

        public PirateAndShip(String name, String ship) {
            this.name = name;
            this.ship = ship;
        }

        public String whois() {
            return "We are the true pirates!";
        }
    }

    List<PirateAndShip> piratesAndShips = new ArrayList<>();
    Set<String> whoisSet = new HashSet<>();

    @Given("Amidst the bottom of the ocean they found others")
    public void amidstTheBottomOfTheOceanTheyFoundOthers(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            piratesAndShips.add(new PirateAndShip(columns.get("name"), columns.get("ship")));
        }
    }

    @When("Alicia and Jonny asked who they where")
    public void aliciaAndJonnyAskedWhoTheyWhere() {
        whoisSet = piratesAndShips.stream().map(PirateAndShip::whois).collect(Collectors.toSet());
    }

    @Then("they said: {string}")
    public void theySaid(String said) {
        assertTrue(whoisSet.size() == 1 && whoisSet.contains(said));
    }

    @Given("Whilst drinking another glass of rum, {sailor} counted the pirates")
    public void whilstDrinkingAnotherGlassOfRumJonnyCountedThePirates(Sailor sailor, DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            piratesAndShips.add(new PirateAndShip(columns.get("name"), columns.get("ship")));
        }
    }
}
