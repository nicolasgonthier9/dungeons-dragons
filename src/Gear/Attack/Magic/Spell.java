package src.Gear.Attack.Magic;
import src.Gear.Attack.AttackGear;
import src.Gear.Attack.AttackType;

public class Spell extends AttackGear {
    public Spell (AttackType spellType, String name, int atk) {
        super(spellType, name, atk);
    }

        Spell bolt = new Spell(AttackType.Lightning, "Lightning Bolt", 2);
}
