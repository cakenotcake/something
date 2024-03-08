package com.design.decorator;

public class MaximiseSpellDecorator extends SpellDecorator {

    public MaximiseSpellDecorator(Spell spell) {
        this.spell = spell;
    }

    @Override
    public String getDescription() {
        return "Maximise " + spell.getDescription();
    }

    @Override
    public Double getDamage() {
        return 10d + spell.getDamage();
    }
}
