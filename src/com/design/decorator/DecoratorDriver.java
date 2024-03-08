package com.design.decorator;

import java.util.Arrays;
import java.util.List;

public class DecoratorDriver {
    public static void main(String[] args) {
        Spell[] spells = {new Fireball(), new MaximiseSpellDecorator(new DoubleSpellDecorator(new Fireball())), new DoubleSpellDecorator(new MaximiseSpellDecorator(new Fireball()))};
        Arrays.stream(spells).forEach(DecoratorDriver::show);
    }


    static void show(Spell spell){
        System.out.println(spell.getDescription() + " has " + spell.getDamage() + " damage");
    }
}
