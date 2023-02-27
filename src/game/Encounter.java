package src.game;

import src.characters.Character;
import src.characters.enemies.*;

import java.util.Objects;
import java.util.Random;

public class Encounter implements Case {
    private final Character monster;
    public Encounter() {
        Random r = new Random();
        int luck = r.nextInt(1,2);
        if (luck == 1) {
            this.monster = new Goblin("Grey Goblin");
        } else {
            this.monster = new Sorcerer("Soul Bender");
        }
    }
    public Encounter(Character monster) {
        this.monster = monster;
    }

    @Override
    public void action(Character player) {
        // FIGHT
        System.out.println("Watch out ! A "+this.monster.getName() +" just appeared !");
    }
}
