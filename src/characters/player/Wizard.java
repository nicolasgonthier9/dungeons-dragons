package src.characters.player;
import src.characters.Character;
import src.gear.protection.magic.ProtectionPotion;

import java.util.Random;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name,"Wizard");
        Random pwr = new Random();
        this.setAttackNoise("....SwwWooshHH....");
        this.setAttackGear(null);
        this.setHealth(pwr.nextInt(2,5) + 1);
        this.setStrength(pwr.nextInt(7, 14) + 1);
        this.setProtectionGear(new ProtectionPotion( "Red Mist", 2));
    }
}
