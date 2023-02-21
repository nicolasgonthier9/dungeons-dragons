package src.characters.enemies;

import src.characters.Character;

public class EvilSpirit extends Character {
    private final String naturalEnemy;

    public EvilSpirit(String name) {
        super(name);
        this.naturalEnemy = "Wizard";
        this.setHealth(15);
        this.setStrength(5);
    }
    public String getNaturalEnemy() {
        return naturalEnemy;
    }

    @Override
    public String getAttackNoise() {
        return "jjjjjjjjjjjj";
    }
    @Override
    public String getType() {
        return "Spirit";
    }
}
