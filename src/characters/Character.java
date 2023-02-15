package src.characters;
import src.gear.attack.AttackGear;
import src.gear.protection.ProtectionGear;


abstract public class Character {
    /**
     * ATTRIBUTES
     */
    private String name;
    private int health;
    private int strength;
    private int position;
    private String type;
    private String attackNoise;
    private AttackGear atkGear;
    private ProtectionGear defGear;
    //________________________________________________________

    /**
     * CONSTRUCTORS
     * @param name
     * @param type
     */
    public Character (String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void strike (Character character) {
        System.out.println(this.getName()+" hits !");
        System.out.println(this.getAttackNoise() + " loses "+(this.getStrength()+this.atkGear.getAtk())+" HP");
        character.setHealth(character.getHealth() - (this.getStrength()+this.atkGear.getAtk()));
    }

    /**
     * Si le personnage trouve une arme, je l'instancie via la méthode setAtkGear et j'instancie l'arme trouvée dans le paramètre
     * de la méthode setAtkGear.
     */
//________________________________________________________________________
    /**
     * SETTERS
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setPosition (int position) {
        this.position = position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAttackNoise(String attackNoise) {
        this.attackNoise = attackNoise;
    }
    public void setAttackGear(AttackGear atkGear) {
        this.atkGear = atkGear;
    }
    public void setProtectionGear(ProtectionGear defGear) {
        this.defGear = defGear;
    }
    //______________________________________________________________

    /**
     * GETTERS
     * @return
     */
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }

    public int getPosition() {
        return position;
    }

    public String getAttackNoise() {
        return attackNoise;
    }
    public AttackGear getAtkGear() {
        return atkGear;
    }
    public ProtectionGear getDefGear() {
        return defGear;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", type='" + type + '\'' +
                ", attackNoise='" + attackNoise + '\'' +
                ", atkGear=" + atkGear +
                ", defGear=" + defGear +
                ", position="+ position +
                '}';
    }
}