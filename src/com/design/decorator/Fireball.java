package com.design.decorator;

public class Fireball implements Spell {

    @Override
    public String getDescription() {
        return "Fireball";
    }

    @Override
    public Double getDamage() {
        return 10d;
    }
}
