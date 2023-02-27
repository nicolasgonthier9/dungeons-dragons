package src.characters.player;

import src.characters.Character;

import java.util.Random;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name);
        Random stats = new Random();
        this.setHealth(stats.nextInt(2,5) + 1);
        this.setStrength(stats.nextInt(7,14) + 1);
    }
    @Override
    public String getType() {
        return "Wizard";
    }

    @Override
    public String getAttackNoise() {
        return "SWWooosshHHH";
    }
}
