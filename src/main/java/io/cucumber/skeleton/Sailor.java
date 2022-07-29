package io.cucumber.skeleton;

public class Sailor {
    private String name;
    private SailorState sailorState;

    public Sailor(String name) {
        this.name = name;
    }

    public void computeStateOfMind(SailorAction action) {
        switch (action) {
            case READING_BOOKS:
            case SEEN_SHARK:
                sailorState = SailorState.SATISFIED;
                break;
            case SEEN_WHAT_APPEARS_KRAKEN:
                sailorState = SailorState.NERVOUS;
                break;
            case CONFIRMED_KRAKEN:
                sailorState = SailorState.TERRIFIED;
                break;
            case DEAD:
                sailorState = SailorState.GHOST;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public SailorState getSailorState() {
        return sailorState;
    }
}
