package src.gear.protection.magic;

import src.gear.protection.ProtectionGear;
import src.gear.protection.ProtectionType;

public class ProtectionPotion extends ProtectionGear {
    public ProtectionPotion(String name, int def) {
        super( ProtectionType.Potion, name, def);
    }
}
