package src;

public class Character {
    private ProtectionGear shield;
    private AttackGear weapon;
    private String name;
    private int health;
    private int strength;
    private CharacterType type;
    public Character() {
        // NO ARGUMENTS
    }
    public Character(String name) {
        this.name = name;
    }

    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        if (type == CharacterType.Warrior) {
            this.health = 10;
            this.strength = 10;
            this.weapon = new AttackGear("Blade", "Blade of Chaos", 5);
            this.shield = new ProtectionGear("Shield", "Shield of Exodus", 10);
        }
        if (type == CharacterType.Wizard) {
            this.health = 6;
            this.strength = 15;
            this.weapon = new AttackGear("Spell", "Osteoporosis", 5);
            this.shield = new ProtectionGear("Potion", "Codeine", 10);
        }
    }
    public int getHealth() {
        return health;
    };
    public int getStrength() {
        return strength;
    };
    public CharacterType getType() {
        return type;
    };
    public String getName() {
        return name;
    };

    public ProtectionGear getShield() {
        return shield;
    }

    public void setShield(ProtectionGear shield) {
        this.shield = shield;
    }

    public AttackGear getWeapon() {
        return weapon;
    }

    public void setWeapon(AttackGear weapon) {
        this.weapon = weapon;
    }
}