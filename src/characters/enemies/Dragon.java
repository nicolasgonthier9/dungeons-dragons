package src.characters.enemies;

import src.characters.Character;

public class Dragon extends Character {
    public Dragon(String name) {
        super(name);
        this.setHealth(15);
        this.setStrength(4);
    }

    @Override
    public String getType() {
        return "Dragon";
    }

    @Override
    public String getAttackNoise() {
        return "SKRrrrRRrrrRR";
    }
}
