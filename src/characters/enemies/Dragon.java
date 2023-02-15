package src.characters.enemies;
import src.characters.Character;

public class Dragon extends Character {
    public Dragon(String name, int position) {
        super(name,"Dragon");
        this.setPosition(position);
        this.setAttackNoise("FRRRRRRRRR !");
        this.setHealth(15);
        this.setStrength(4);
    }
}
