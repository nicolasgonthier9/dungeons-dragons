package src;
import src.gear.protection.GameBoard;
import src.characters.Character;
import java.util.Objects;
import java.util.Scanner;

public class Game {
    Scanner keyPress = new Scanner(System.in);
    private final Character character;
    private final GameBoard board;
//    private Random r = new Random();
    private int playerPosition = 1;

    /**
     *
     * @param myCharacter
     * @param board
     */
    public Game(Character myCharacter, GameBoard board) {
        this.character = myCharacter;
        this.board = board;
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
            pick = board.checkCase(pick, board.getCratePosition(), playerPosition);
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
        if (Objects.equals(select, "2")) {
            System.out.println("Bye bye");
            return false;
        } else {
            return true;
        }
    }

}
