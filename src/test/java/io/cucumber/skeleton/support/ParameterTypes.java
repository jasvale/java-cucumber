package io.cucumber.skeleton.support;

import io.cucumber.java.ParameterType;
import io.cucumber.skeleton.Sailor;

public class ParameterTypes {

    @ParameterType("Peter|Mary|Jonny|Alicia")
    public Sailor sailor(String name) {
        return new Sailor(name);
    }
}
