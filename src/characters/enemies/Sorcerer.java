package src.characters.enemies;

import src.characters.Character;

public class Sorcerer extends Character {

    public Sorcerer(String name) {
        super(name);
        this.setHealth(9);
        this.setStrength(2);
    }

    @Override
    public String getType() {
        return "Sorcerer";
    }

    @Override
    public String getAttackNoise() {
        return "hmmmppfff";
    }
}
