package src.game;

import src.characters.Character;
import src.characters.enemies.Dragon;


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
                case 11, 23, 35 -> {
                    this.board.add(i, new Encounter());
                }
                case 47 -> {
                    this.board.add(i, new Encounter(character));
                }
                case 59 -> {
                    this.board.add(i, new Encounter(new Dragon("Sun Dragon")));
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
        if (!hasFinishedGame()) {
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

    public void setBoard(List<Case> board) {
        this.board = board;
    }

    public List<Case> getBoard() {
        return board;
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
