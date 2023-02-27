package src.characters.player;

import src.equipment.Atk.AtkGear;
import src.equipment.Def.DefGear;
import src.characters.Character;

import java.util.Random;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name);
        Random stats = new Random();
        this.setHealth(stats.nextInt(4,9) + 1);
        this.setStrength(stats.nextInt(4,9) + 1);
        this.setAttackGear(new AtkGear("Wood", 1));
        this.setDefenseGear(new DefGear("Wooden Shield", 1));
    }

    @Override
    public String getType() {
        return "Warrior";
    }
    @Override
    public String getAttackNoise() {
        return "HAAAAA !";
    }


}
