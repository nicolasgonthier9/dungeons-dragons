package src.Gear.Attack.Combat;

import src.Gear.Attack.AttackGear;
import src.Gear.Attack.AttackType;

public class Weapon extends AttackGear {
    public Weapon(AttackType weaponType, String name, int atk) {
        super(weaponType, name, atk);
    }
    Weapon bladeExample = new Weapon(AttackType.Blade, "Heavy Blade", 5);
}
