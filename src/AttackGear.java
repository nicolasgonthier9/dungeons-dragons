package src;

public class AttackGear {
    private final String weaponType;
    private final String name;
    private final int atk;

    public AttackGear(String weaponType, String name, int atk) {
        this.weaponType = weaponType;
        this.name = name;
        this.atk = atk;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }
}
