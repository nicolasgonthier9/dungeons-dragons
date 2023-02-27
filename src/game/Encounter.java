package src.game;

import src.characters.Character;

public class Encounter implements Case {
    private final Character monster;
    public Encounter(Character monster) {
        this.monster = monster;
    }

    @Override
    public void action(Character player) {
        System.out.println("Watch out ! A "+this.monster.getName() +" just appeared !");
        System.out.println("You have to fight.");
        while (!isDead(this.monster)) {
            fight(player, this.monster);
            if (isDead(player)) {
                System.out.println("0 HP left");
                System.out.println("YOU DIED.");
            }
        }
    }

    private boolean isDead(Character any) {
        if (any.getHealth() == 0 || any.getHealth() < 0) {
            any = null;
            return true;
        }
        return false;
    }
    private void fight(Character player, Character monster) {
        int playerHit = player.getStrength();
        int monsterHit = monster.getStrength();
        if (player.getAttackGear() != null) {
            playerHit = player.getStrength()+player.getAttackGear().getAtk();
        }

        System.out.println("You hit " + monster.getName() + " for " + playerHit);
        monster.setHealth(monster.getHealth() - playerHit);
        System.out.println(monster.getHealth()+ "HP left.");

        System.out.println(monster.getName() + " hits you for " + monsterHit);
        player.setHealth(player.getHealth() - monsterHit);
        System.out.println(player.getHealth()+ "HP left.");

    }
    @Override
    public String toString() {
        return "Encounter{" +
                "monster=" + monster +
                '}';
    }
}
