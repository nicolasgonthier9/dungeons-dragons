package src.characters.player;

import src.characters.Character;

import java.util.Random;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
        Random stats = new Random();
        this.setHealth(stats.nextInt(4,9) + 1);
        this.setStrength(stats.nextInt(4,9) + 1);
    }

    @Override
    public String getType() {
        return "Warrior";
    }
    @Override
    public String getAttackNoise() {
        return "HAAAAA !";
    }


}
