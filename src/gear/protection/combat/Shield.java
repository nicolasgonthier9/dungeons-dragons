package src.gear.protection.combat;

import src.gear.protection.ProtectionGear;
import src.gear.protection.ProtectionType;

public class Shield extends ProtectionGear {
    public Shield(String name, int def) {
        super( ProtectionType.Shield, name, def);
    }
}
