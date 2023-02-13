package src.gear.attack.magic;
import src.gear.attack.AttackGear;
import src.gear.attack.AttackType;

public class Spell extends AttackGear {
    public Spell (AttackType spellType, String name, int atk) {
        super(spellType, name, atk);
    }

        Spell bolt = new Spell(AttackType.Lightning, "Lightning Bolt", 2);
}
