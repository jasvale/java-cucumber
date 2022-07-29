package io.cucumber.skeleton;

public class Pirate {
    private String name;

    public Pirate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean respected() {
        return true;
    }
}
