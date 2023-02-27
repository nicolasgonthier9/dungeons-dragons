package src.characters;

import src.equipment.Atk.AtkGear;

abstract public class Character {
    private String name;
    private int health;
    private int strength;
    private AtkGear attackGear;
    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAttackGear(AtkGear attackGear) {
        this.attackGear = attackGear;
    }

    public AtkGear getAttackGear() {
        return attackGear;
    }

    public abstract String getType();

    public abstract String getAttackNoise();

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", weapon=" + attackGear +
                '}';
    }
}
