package com.design.decorator;

public class DoubleSpellDecorator extends SpellDecorator {

    public DoubleSpellDecorator(Spell spell) {
        this.spell = spell;
    }

    @Override
    public String getDescription() {
        return "Double " + spell.getDescription();
    }

    @Override
    public Double getDamage() {
        return 2 * spell.getDamage();
    }
}
