package src.gear.attack;

/**
 * Model for an Attack gear
 */
abstract public class AttackGear {
    /**
     * The object name
     */
    private String name;
    private int atk;
    private AttackType weaponType;

    public AttackGear(AttackType weaponType, String name, int atk) {
        this.weaponType = weaponType;
        this.name = name;
        this.atk = atk;
    }
//_______________________________________________________________________________

    // SETTERS
    public void setWeaponType(AttackType weaponType) {
        this.weaponType = weaponType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
//______________________________________________________________________________

    // GETTERS
    public AttackType getWeaponType() {
        return weaponType;
    }
    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }
}
