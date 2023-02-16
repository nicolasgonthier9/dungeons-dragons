package src.characters.enemies;

import src.characters.Character;

public class Goblin extends Character {

    public Goblin(String name) {
        super(name);
        this.setHealth(6);
        this.setStrength(1);
    }

    @Override
    public String getType() {
        return "Goblin";
    }

    @Override
    public String getAttackNoise() {
        return "BURP";
    }
}
