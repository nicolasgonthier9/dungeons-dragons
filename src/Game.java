package src;

import src.Player.Character;

import java.util.Objects;
import java.util.Scanner;
public class Game {
    Scanner keyPress = new Scanner(System.in);
    private final Character character;
//    public int[] gameBoard = {
//            1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,
//            17,18,19,20,21,22,23,24,25,26,27,28,
//            29,30,31,32,33,34,35,36,37,38,39,40,
//            41,42,43,44,45,46,47,48,49,50,51,52,
//            53,54,55,56,57,58,59,60,61,62,63,64
//    };
    private int playerPosition = 1;


    public Game(Character myCharacter) {
        this.character = myCharacter;
    }
    public void run() {
        System.out.println("GAME START");
        System.out.println("You start with : "+character.getHealth());
        System.out.println(character.getName()+" is on case number : "+playerPosition+"/64");
        while (playerPosition < 64 && continueOrExit()) {
            move();
        }
    }
    private int throwDice() {
        System.out.println("You got a ...");
        int pick = (int)(Math.random()*6+1);
        System.out.println(pick);
        System.out.println("Move "+pick+" cases further");
        return pick;
    }

    private boolean continueOrExit() {
        String continueOrExit;
        System.out.println("Press 'Enter' to roll the dice or type 'exit' to end the game.");
        continueOrExit = keyPress.nextLine();
        return !Objects.equals(continueOrExit, "exit");
    }

    private void move() {
        int pick = throwDice();
        while (pick > 0 && playerPosition < 64){
            playerPosition++;
            System.out.println(playerPosition);
            pick--;
        }
        System.out.println("You are now on case "+playerPosition+"/64");
        if (playerPosition == 64) {
            pick = 0;
            System.out.println("You made it to the end ! Congratulations !");
        }
    }

    public boolean restart() {
        String select;
        System.out.println("GAME OVER");
        System.out.println(" - 1 -      - 2 -");
        System.out.println("Restart     Exit");
        select = keyPress.nextLine();
        if (Objects.equals(select, "1")) {
            return true;
        } else {
            System.out.println("Bye bye");
            return false;
        }
    }
    public Character getCharacter() {
        return character;
    }
}
