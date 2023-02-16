package src;

import src.characters.Character;

public class Game {
    public static final int CASE_NB = 64;
    private Character character;
    private Dice dice;
    private int characterPosition;

    public Game() {
        this.character = null;
        this.characterPosition = 0;
        this.dice = new Dice();
    }
    public void playTurn() {
        System.out.println("You got a ...");
        int pick = this.dice.throwDice();
        System.out.println(pick);
        System.out.printf("Move %d cases further", pick);
    }

    public Character getCharacter() {
        return character;
    }
    public void setCharacter(Character character) {
        this.character = character;
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

    @Override
    public String toString() {
        return "Game{" +
                "character=" + character +
                ", dice=" + dice +
                ", characterPosition=" + characterPosition +
                '}';
    }
}
