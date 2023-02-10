package src.gear.Protection.Magic;

import src.gear.Protection.ProtectionGear;
import src.gear.Protection.ProtectionType;

public class ProtectionPotion extends ProtectionGear {
    public ProtectionPotion(String name, int def) {
        super( ProtectionType.Potion, name, def);
    }
}
