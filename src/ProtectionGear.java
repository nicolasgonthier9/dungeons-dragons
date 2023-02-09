package src;

public class ProtectionGear extends Character{
    private final String protectionType;
    private final String name;
    private final int def;
    public ProtectionGear(String protectionType, String name, int def) {
        this.protectionType = protectionType;
        this.name = name;
        this.def = def;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public String getName() {
        return name;
    }

    public int getDef() {
        return def;
    }
}
