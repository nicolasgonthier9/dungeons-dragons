package src.characters.enemies;
import src.characters.Character;

public class Goblin extends Character {
    public Goblin(String name, int position) {
        super(name,"Cave Goblin");
        this.setPosition(position);
        this.setAttackNoise("GRRRRAAAAHH !");
        this.setHealth(6);
        this.setStrength(1);
    }
}
