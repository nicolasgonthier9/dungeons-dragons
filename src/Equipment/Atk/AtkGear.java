package src.Equipment.Atk;

public class AtkGear {
    private String name;
    private int atk;
    public AtkGear(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public String toString() {
        return "AtkGear{" +
                "name='" + name + '\'' +
                ", atk=" + atk +
                '}';
    }
}
