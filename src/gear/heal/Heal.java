package src.gear.heal;

abstract public class Heal {
    private String name;
    private int regain;

    public Heal(String name, int regain) {
        this.name = name;
        this.regain = regain;
    }

    /**
     * SETTERS
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setRegain(int regain) {
        this.regain = regain;
    }

    /**
     * GETTERS
     *
     * @return
     */
    public String getName() {
        return name;
    }
    public int getRegain() {
        return regain;
    }
}
