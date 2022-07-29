package io.cucumber.skeleton;

public class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean anyDispleasedPrivateers() {
        return false;
    }

    public boolean sails() {
        return true;
    }
}
