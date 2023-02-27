package src.game;

import src.characters.Character;
import src.equipment.Atk.AtkGear;
import src.equipment.Potion;

import java.util.Random;

public class Crate implements Case{
    private Potion potion;
    private AtkGear weapon;
    Random r = new Random();
    public Crate(AtkGear weapon) {
        this.weapon = weapon;
    }
    public Crate(Potion potion) {
        this.potion = potion;
    }
    public AtkGear getWeapon() {
        return weapon;
    }
    public Potion getPotion() {
        return potion;
    }
    public boolean hasWeapon(Character player) {
        return player.getAttackGear() != null;
    }

    @Override
    public void action(Character player) {
        System.out.println("You found a crate !");
    }

    @Override
    public String toString() {
        return "Crate{" +
                "potion=" + potion +
                ", weapon=" + weapon +
                '}';
    }
}
