package src.characters.enemies;

import src.characters.Character;

public class Orc extends Character {
    private final String naturalEnemy;

    public Orc(String name) {
        super(name);
        this.naturalEnemy = "Warrior";
        this.setHealth(10);
        this.setStrength(6);
    }
    public String getNaturalEnemy() {
        return naturalEnemy;
    }

    @Override
    public String getAttackNoise() {
        return "GggrrrRhaaaHhh";
    }
    @Override
    public String getType() {
        return "Orc";
    }
}
