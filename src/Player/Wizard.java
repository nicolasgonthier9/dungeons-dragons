package src.Player;

import java.util.Random;

public class Wizard extends Character{
    public Wizard(String name) {
        super(name,"Wizard");
        Random pwr = new Random();
        this.setAttackNoise("....SwwWooshHH....");
        this.setHealth(pwr.nextInt(2,5) + 1);
        this.setStrength(pwr.nextInt(7, 14) + 1);
    }
}
