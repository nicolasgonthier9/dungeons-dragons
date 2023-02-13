package src.characters;

abstract public class Character {
    private String name;
    private int health;
    private int strength;
    private String type;
    private String attackNoise;
    public Character() {
        // NO ARGUMENTS
    }
    public Character(String name) {
        this.name = name;
    }

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
//        if (type == "Warrior") {
//            this.health = 10;
//            this.strength = 10;
//            this.weapon = new Weapon("Blade of Chaos", 5);
//            this.shield = new Shield("Shield of Exodus", 10);
//        }
//        if (type == CharacterType.Wizard) {
//            this.health = 6;
//            this.strength = 15;
//            this.weapon = new Spell( "Osteoporosis", 5);
//            this.shield = new Potion("Codeine", 10);
//        }
    }
//________________________________________________________________________

    // SETTERS
    public void setHealth(int health) {
        this.health = health;
    };
    public void setStrength(int strength) {
        this.strength = strength;
    };
    public void setName(String name) {
        this.name = name;
    };
    public void setType(String type) {
        this.type = type;
    }

    public void setAttackNoise(String attackNoise) {
        this.attackNoise = attackNoise;
    }
    //______________________________________________________________

    // GETTERS
    public String getName() {
        return name;
    };
    public String getType() {
        return type;
    }
    public int getHealth() {
        return health;
    };
    public int getStrength() {
        return strength;
    };
    public String getAttackNoise() {
        return attackNoise;
    }
}