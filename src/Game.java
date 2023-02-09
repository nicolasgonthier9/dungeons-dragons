package src;

import java.util.Scanner;

public class Game {
    Scanner keyPress = new Scanner(System.in);
    private final Character character;
    public int[] gameBoard = {
            1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,
            17,18,19,20,21,22,23,24,25,26,27,28,
            29,30,31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,51,52,
            53,54,55,56,57,58,59,60,61,62,63,64
    };
    public int playerPosition = 1;


    public Game(Character myCharacter) {
        this.character = myCharacter;
    }
    public void run() {
        System.out.println("GAME START");
        System.out.println("Character : "+character.getName());
        System.out.println("Health : "+character.getHealth());
        System.out.println("You are on case number : "+playerPosition+"/64");
        while (playerPosition < 64) {
            move();
        }
    }
    public int throwDice() {
        System.out.println("Press 'Enter' to roll the dice");
        keyPress.nextLine();
        System.out.println("You got a ...");
        int pick = (int)(Math.random()*6+1);
        System.out.println(pick);
        System.out.println("Move "+pick+" cases further");
        return pick;
    }
    public void move() {
        int pick = throwDice();
        while (pick > 0){
            if (playerPosition == 64) {
                pick = 0;
                System.out.println("You made it to the end ! Congratulations !");
            }
            playerPosition++;
            System.out.println(playerPosition);
            pick--;
        }
        System.out.println("You are now on case "+playerPosition+"/64");

    }
    public Character getCharacter() {
        return character;
    }
}
