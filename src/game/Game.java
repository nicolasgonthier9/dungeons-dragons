package src.game;

import src.characters.Character;
import src.characters.enemies.Dragon;
import src.characters.enemies.Goblin;
import src.characters.enemies.Sorcerer;
import src.equipment.Atk.*;
import src.equipment.Potion;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    public static final int CASE_NB = 64;
    private Character character;
    private final Dice dice;
    private int characterPosition;
    public List<Case> board;
    Random r = new Random();


    public Game() {
        this.character = null;
        this.characterPosition = 0;
        this.dice = new Dice();
        this.board = new ArrayList<Case>();
        for (int i = 0; i <= 63; i++) {
            switch (i) {
                case 19, 26, 42, 53 -> {
                    this.board.add(i, new Crate(new Sword("Steel Sword")));
                }
                case 1, 4, 8, 17, 23 -> {
                    this.board.add(i, new Crate(new LightningSpell("Lightning Bolt")));
                }
                case 7, 13, 31, 33, 39, 43 -> {
                    this.board.add(i, new Crate(new Potion("Small Potion", 2)));
                }
                case 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 -> {
                    this.board.add(i, new Encounter(new Goblin("Goblin")));
                }
                case 10, 20, 25, 32, 35, 36, 37, 40, 44, 47 -> {
                    this.board.add(i, new Encounter(new Sorcerer("Sorcerer")));
                }
                case 45, 52, 56, 62 -> {
                    this.board.add(i, new Encounter(new Dragon("Dragon")));
                }
                case 2, 11, 5, 22, 38 -> {
                    this.board.add(i, new Crate(new Mace("Mace")));
                }
                case 48, 49 -> {
                    this.board.add(i, new Crate(new FireSpell("Grillz")));
                }
                case 28, 41 -> {
                    this.board.add(i, new Crate(new Potion("Great Potion", 5)));
                }
                default -> {
                    this.board.add(i, new EmptyCase());
                }
            }
        }
    }

    private boolean isEmpty(int i) {
        return board.get(i) == null;
    }

    public void playTurn() {
        System.out.println("You got a ...");
        int pick = this.dice.throwDice();
        System.out.println(pick);
        System.out.println("Move "+pick+ " cases further");
        while (pick > 0 && !hasFinishedGame()) {
            System.out.println(characterPosition +1);
            pick--;
            this.characterPosition++;
            if (hasFinishedGame()) {
                System.out.println("CONGRATULATIONS !");
                System.out.println("You made it to the end of the game !");
            }
        }
        if (!hasFinishedGame() && pick == 0) {
            this.board.get(characterPosition).action(character);
        }
    }
    public boolean hasCharacter() {
        return this.character != null;
    }
    public void unsetPlayer() {
        this.character = null;
    }

    public boolean hasFinishedGame() {
        return this.characterPosition >= CASE_NB;
    }

    public Character getCharacter() {
        return character;
    }
    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Game{" +
                "character=" + character +
                ", dice=" + dice +
                ", characterPosition=" + characterPosition +
                '}';
    }
}
