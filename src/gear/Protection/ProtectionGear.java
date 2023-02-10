package src.gear.Protection;
abstract public class ProtectionGear {
    private String name;
    private int def;
    private ProtectionType protectionType;
    public ProtectionGear( ProtectionType protectionType, String name, int def) {
        this.protectionType = protectionType;
        this.name = name;
        this.def = def;
    }

    // SETTERS
    public void setProtectionType(ProtectionType protectionType) {
        this.protectionType = protectionType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDef(int def) {
        this.def = def;
    }

    // GETTERS
    public ProtectionType getProtectionType() {
        return protectionType;
    }
    public String getName() {
        return name;
    }
    public int getDef() {
        return def;
    }
}
