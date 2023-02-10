package src.gear.Protection.Combat;

import src.gear.Protection.ProtectionGear;
import src.gear.Protection.ProtectionType;

public class Shield extends ProtectionGear {
    public Shield(String name, int def) {
        super( ProtectionType.Shield, name, def);
    }
}
