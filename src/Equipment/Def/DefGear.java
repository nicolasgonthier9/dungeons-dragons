package src.Equipment.Def;

public class DefGear {
    private String name;
    private int def;
    public DefGear(String name, int def) {
        this.name = name;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "DefGear{" +
                "name='" + name + '\'' +
                ", def=" + def +
                '}';
    }
}
