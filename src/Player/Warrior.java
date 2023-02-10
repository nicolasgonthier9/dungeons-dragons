package src.Player;

import java.util.Random;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name,"Warrior");
        Random pwr = new Random();

        this.setAttackNoise("AYAAA !");
        this.setHealth(pwr.nextInt(4,9) + 1);
        this.setStrength(pwr.nextInt(4,9) + 1);
    }
}
