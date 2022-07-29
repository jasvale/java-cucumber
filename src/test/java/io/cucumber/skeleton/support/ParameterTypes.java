package io.cucumber.skeleton.support;

import io.cucumber.java.ParameterType;
import io.cucumber.skeleton.Pirate;
import io.cucumber.skeleton.Sailor;
import io.cucumber.skeleton.Ship;

public class ParameterTypes {

    @ParameterType("Peter|Mary|Jonny|Alicia")
    public Sailor sailor(String name) {
        return new Sailor(name);
    }

    @ParameterType("Edward \"Blackbeard\" Teach")
    public Pirate pirate(String name) {
        return new Pirate(name);
    }

    @ParameterType("Queen Anne's Revenge")
    public Ship ship(String name) {
        return new Ship(name);
    }
}
