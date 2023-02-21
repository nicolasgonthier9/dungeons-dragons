package src;

import src.characters.Character;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int CASE_NB = 64;
    private Character character;
    private final Dice dice;
    private int characterPosition;
    public List<Case> board = new ArrayList<Case>();


    public Game() {
        this.character = null;
        this.characterPosition = 1;
        this.dice = new Dice();
    }
    public void playTurn() {
        System.out.println("You got a ...");
        int pick = this.dice.throwDice();
        System.out.println(pick);
        System.out.println("Move "+pick+ " cases further");
        while (pick > 0 && !hasFinishedGame()) {
            System.out.println(characterPosition);
            pick--;
            this.characterPosition++;
        }
    }

    public boolean hasCharacter() {
        return this.character != null;
    }
    public void unsetPlayer() {
        this.character = null;
    }


    public boolean hasFinishedGame() {
        return this.characterPosition > CASE_NB;
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
