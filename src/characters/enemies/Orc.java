package src.characters.enemies;
import src.characters.Character;

public class Orc extends Character {
    /**
     * CONSTRUCTORS
     *
     * @param name
     * @param type
     */
    public Orc(String name, int position) {
        super(name, "Orc");
        this.setPosition(position);
        this.setHealth(10);
        this.setStrength(6);
    }
}
