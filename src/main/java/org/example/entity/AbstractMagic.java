package org.example.entity;

import java.util.ArrayList;

public abstract class AbstractMagic extends Unit {

    public int mana;

    public AbstractMagic(String name, int damage, int moveDistance, int maxHp, int hp, int speed, int mana, int x, int y) {
        super(name, damage, moveDistance, maxHp, hp, speed, x, y);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        if (getState() == "dead") return;
    }
}


