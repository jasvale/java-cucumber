package io.cucumber.skeleton;

public class Sailor {
    private String name;
    private SailorStateOfMind stateOfMind;

    public Sailor(String name) {
        this.name = name;
    }

    public void computeStateOfMind(SailorAction action) {
        switch (action) {
            case READING_BOOKS:
            case SEEN_SHARK:
                stateOfMind = SailorStateOfMind.SATISFIED;
                break;
            case SEEN_WHAT_APPEARS_KRAKEN:
                stateOfMind = SailorStateOfMind.NERVOUS;
                break;
            case CONFIRMED_KRAKEN:
                stateOfMind = SailorStateOfMind.TERRIFIED;
                break;
            case DEAD:
                stateOfMind = SailorStateOfMind.GHOST;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public SailorStateOfMind getStateOfMind() {
        return stateOfMind;
    }
}
