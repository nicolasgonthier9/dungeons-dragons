package src;

import src.Equipment.Atk.AtkGear;
import src.Equipment.Def.DefGear;
import src.Equipment.Potion;

public class Crate {
    private Potion potion;
    private AtkGear weapon;
    private DefGear protection;
    public Crate(AtkGear weapon) {
        this.weapon = weapon;
    }
    public Crate(DefGear protection) {
        this.protection = protection;
    }
    public Crate(Potion potion) {
        this.potion = potion;
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
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
}
