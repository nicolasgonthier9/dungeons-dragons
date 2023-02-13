package src.gear.attack.combat;

import src.gear.attack.AttackGear;
import src.gear.attack.AttackType;

public class Weapon extends AttackGear {
    public Weapon(AttackType weaponType, String name, int atk) {
        super(weaponType, name, atk);
    }
    //Weapon bladeExample = new Weapon(AttackType.Blade, "Heavy Blade", 5);
}
