package src.characters.player;

import src.equipment.Atk.AtkGear;
import src.equipment.Def.DefGear;
import src.characters.Character;

import java.util.Random;

public class Wizard extends Character {
    public Wizard(String name) {
        super(name);
        Random stats = new Random();
        this.setHealth(stats.nextInt(2,5) + 1);
        this.setStrength(stats.nextInt(7,14) + 1);
        this.setAttackGear(new AtkGear("Staffilocoque", 1));
        this.setDefenseGear(new DefGear("Codeine", 1));
    }
    @Override
    public String getType() {
        return "Wizard";
    }

    @Override
    public String getAttackNoise() {
        return "SWWooosshHHH";
    }
}
