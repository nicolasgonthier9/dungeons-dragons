package src.game;

import src.characters.Character;
import src.equipment.Atk.AtkGear;
import src.equipment.Def.DefGear;
import src.equipment.Potion;

import java.util.Objects;
import java.util.Random;

public class Crate implements Case{
    private Potion potion;
    private AtkGear weapon;
    private DefGear protection;
    Random r = new Random();

    public Crate(Character player) {
        int lootType = r.nextInt(1, 3);
        int loot = r.nextInt(1, 2);
        if (lootType == 1) {
            switch (player.getType()) {
                case "Wizard" -> {
                    if (loot == 1) {
                        this.weapon = new AtkGear("Rai Splash", 2);
                    } else {
                        this.weapon = new AtkGear("Fire Bolt", 7);
                    }
                    player.setAttackGear(weapon);
                }
                case "Warrior" -> {
                    if (loot == 1) {
                        this.weapon = new AtkGear("Mace", 3);
                    } else {
                        this.weapon = new AtkGear("Great Sword", 5);
                    }
                    player.setAttackGear(weapon);
                }
            }
        } else if (lootType == 2){
            switch (player.getType()) {
                case "Wizard" -> {
                    if (loot == 1) {
                        this.protection = new DefGear("Codeine", 2);
                    } else {
                        this.protection = new DefGear("Paracetamol", 7);
                    }
                    player.setDefenseGear(protection);
                }
                case "Warrior" -> {
                    if (loot == 1) {
                        this.protection = new DefGear("Wooden Shield", 3);
                    } else {
                        this.protection = new DefGear("Great Shield", 5);
                    }
                    player.setDefenseGear(protection);
                }
            }
        } else {
            switch (loot) {
                case 1 -> {
                    System.out.println("You found a small Potion");
                    player.setHealth(player.getHealth() + 2);
                    System.out.println("You regain 2 HP.");
                }
                case 2 -> {
                    System.out.println("You found a great Potion");
                    player.setHealth(player.getHealth() + 5);
                    System.out.println("You regain 5 HP.");
                }
            }
        }
    }

    public AtkGear getWeapon() {
        return weapon;
    }

    public void setWeapon(AtkGear weapon) {
        this.weapon = weapon;
    }

    public DefGear getProtection() {
        return protection;
    }

    public void setProtection(DefGear protection) {
        this.protection = protection;
    }

    @Override
    public void action(Character player) {

    }
}
