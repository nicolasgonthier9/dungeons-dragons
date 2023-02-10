package src.Gear.Protection.Magic;

import src.Gear.Protection.ProtectionGear;
import src.Gear.Protection.ProtectionType;

public class ProtectionPotion extends ProtectionGear {
    public ProtectionPotion(String name, int def) {
        super( ProtectionType.Potion, name, def);
    }
}
