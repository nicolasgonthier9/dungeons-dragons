public class Character {
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
            AttackGear weapon = new AttackGear("Blade", "Blade of Chaos", 5);
            ProtectionGear shield = new ProtectionGear("Shield", "Shield of Exodus", 10);

        }
        if (type == CharacterType.Wizard) {
            this.health = 6;
            this.strength = 15;
            AttackGear weapon = new AttackGear("Spell", "Osteoporosis", 5);
            ProtectionGear shield = new ProtectionGear("Potion", "Codeine", 10);

        }

    }
}