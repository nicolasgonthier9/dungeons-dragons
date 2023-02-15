package src.characters.enemies;
import src.characters.Character;
public class Sorcerer extends Character {
    public Sorcerer(String name, int position) {
        super(name,"Sorcerer");
        this.setPosition(position);
        this.setAttackNoise("HAAAAA !");
        this.setHealth(9);
        this.setStrength(2);
    }
}
