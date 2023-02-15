package src.characters.enemies;

import src.characters.Character;

public class EvilSpirit extends Character {
    /**
     * CONSTRUCTORS
     *
     * @param name
     */
    public EvilSpirit(String name, int position) {
        super(name, "Spirit");
        this.setPosition(position);
        this.setHealth(15);
        this.setStrength(5);
    }
}
