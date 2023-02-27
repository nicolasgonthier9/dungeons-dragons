package src.equipment;

public class Potion {
    private String name;
    private int regain;

    public Potion(String name, int regain) {
        this.name = name;
        this.regain = regain;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegain() {
        return regain;
    }

    public void setRegain(int regain) {
        this.regain = regain;
    }
}
