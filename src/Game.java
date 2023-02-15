package src;
import src.characters.Character;

import java.util.Objects;
import java.util.Scanner;

public class Game {
    Scanner keyPress = new Scanner(System.in);
    private final Character character;
    private final GameBoard board;



    /**
     * CONSTRUCTOR
     * @param myCharacter Personnage instancié au lancement du jeu
     * @param board Board instancié au lancement du jeu
     */
    public Game(Character myCharacter, GameBoard board) {
        this.character = myCharacter;
        this.board = board;
    }

    /**
     * MÉTHODE PRINCIPALE POUR LANCER LE JEU
     */
    public void run() {
        System.out.println("GAME START");
        System.out.println("You start with : "+character.getHealth());
        character.setPosition(1);
        System.out.println(character.getName()+" is on case number : "+character.getPosition()+"/64");
        while (character.getPosition() < 64 && continueOrExit()) {
            move();
        }
    }

    /**
     * MÉTHODE DU LANCER DE DÉ
     * @return
     */
    private int throwDice() {
        System.out.println("You got a ...");
        int pick = (int)(Math.random()*6+1);
        System.out.println(pick);
        System.out.println("Move "+pick+" cases further");
        return pick;
    }

    /**
     * FONCTIONNALITÉ PRINCIPALE QUI MAINTIENT LE JEU EN COURS, SI ELLE RETOURNE FALSE LE JEU S'ARRÊTE
     * @return
     */
    private boolean continueOrExit() {
        String continueOrExit;
        System.out.println("Press 'Enter' to roll the dice or type 'exit' to end the game.");
        continueOrExit = keyPress.nextLine();
        return !Objects.equals(continueOrExit, "exit");
    }

/**
 * MÉTHODE GÉRANT L'AVANCÉE DU JOUEUR SUR LE BOARD EN FONCTION DE CE QU'IL RENCONTRE
 */
    private void move() {
        int pick = throwDice();
        while (pick > 0 && character.getPosition() < 64){
            character.setPosition(character.getPosition()+1);
            System.out.println(character.getPosition());
            pick = board.checkCrate(pick, character);
            if (board.checkFoe(pick, character)) {
                fightOrFlight(character, keyPress);
                while (!isDead(character)) {

                }
            }
            pick--;
        }
        System.out.println("You are now on case "+character.getPosition()+"/64");
        if (character.getPosition() == 64) {
            pick = 0;
            System.out.println("You made it to the end ! Congratulations !");
        }
    }

    /**
     * MÉTHODE EN CAS DE FIN DU JEU OU DE MORT DU JOUEUR
     * @return TANT QUE CETTE MÉTHODE RETOURNE TRUE LE JEU CONTINUE, SI ELLE RETOURNE FALSE, LA VARIABLE "GAMESTATE"
     * DE LA CLASSE MAIN PASSE EN FALSE ET ANNULE LA BOUCLE QUI PERMET DE RESTART LE JEU
     */
    public boolean restart() {
        String select;
        System.out.println("    GAME OVER");
        System.out.println(" - 1 -      - 2 -");
        System.out.println("Restart     Exit");
        select = keyPress.nextLine();
        if (Objects.equals(select, "2")) {
            System.out.println("Thank you for playing !");
            return false;
        } else {
            return true;
        }
    }

    /**
     * MÉTHODE GÉRANT LA MORT DU JOUEUR
     * @param myCharacter LE JOUEUR
     */
    public boolean isDead(Character myCharacter) {
        return myCharacter.getHealth() == 0;
    }

    /**
     * MÉTHODE PROMPT POUR LA FUITE OU LE COMBAT
     *
     * @param player  LE JOUEUR
     * @param prompt  LE CHOIX
     */
    public void fightOrFlight(Character player, Scanner prompt) {
        String choice;
        System.out.println(" - 1 -      - 2 -");
        System.out.println("Attack?     Flee?");
        choice = prompt.nextLine();
        if (!Objects.equals(choice, "2")) {
            player.setPosition(character.getPosition() -2);
        }
    }
    public void fight(Character player, Character monster) {

    }

}
