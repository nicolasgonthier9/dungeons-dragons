package src;
import src.characters.Character;
import src.characters.player.Warrior;
import src.characters.player.Wizard;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public Menu() {

    }
    public Character startMenu() {
/**
* J'initialise mes variables qui vont servir à sélectionner dans le menu et remplir/modifier les infos du personnage.
**/
        String select;
        String charName;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to D&D ! Press 'Enter' to start the game"); // PRESS START
        myObj.nextLine();
        System.out.println("Before we start, you have to create your character.");

/**
* le nom du personnage sera celui indiqué dans le prompt.
*/
        System.out.println("First.. Name your character :");
        charName = myObj.nextLine();
        Character myCharacter = createCharacterMenu(charName, myObj);
        System.out.println(myCharacter.getName() + " is now a "+ myCharacter.getType() + " !");

/**
* Personnage créé, nouveau menu pour lancer le jeu ou..
**/
        System.out.println("1 - START");
        System.out.println("2 - Check your character");
        System.out.println("3 - Edit your character");
        select = myObj.nextLine();
/**
 * 1.voir les infos
 **/
        if (Objects.equals(select, "2")) {
            showCharacterInfo(myCharacter);
        }
/**
 * 2.modifier les infos
 */
        else if (Objects.equals(select, "3")) {
            System.out.println("4 - Change name");
            System.out.println("5 - Change type");
            select = myObj.nextLine();

            if (Objects.equals(select, "4")) {
                charName = getNewName(myCharacter);
            } else if (Objects.equals(select, "5")) {
                myCharacter = changeCharacterType(charName, myObj);
                System.out.println("*GAME STARTING*");
                System.out.println("_________________");
            }
            myCharacter.setName(charName);
        } else {
            System.out.println("*GAME STARTING*");
            System.out.println("_________________");
        }
        return myCharacter;
    }




    // MÉTHODES
    private static Character createCharacterMenu(String name, Scanner myObj) {
        String select;
        Character myCharacter;
        System.out.println("Will you play as 1 - Warrior or 2 - Wizard ?");
        select = myObj.nextLine();
        if (Objects.equals(select, "1")) {
            myCharacter = new Warrior(name);
        } else {
            myCharacter = new Wizard(name);
        }
        return myCharacter;
    }
    private Character changeCharacterType(String charName, Scanner myObj) {
        String select;
        System.out.println("1 - Warrior");
        System.out.println("2 - Wizard");
        select = myObj.nextLine();
        Character myCharacter;
        if (Objects.equals(select, "1")) {
            myCharacter = new Warrior(charName);
        } else {
            myCharacter = new Wizard(charName);
        }
        showCharacterInfo(myCharacter);
        return myCharacter;
    }
    // Fonction pour montrer les infos du personnage créé.
    public void showCharacterInfo(Character myCharacter) {
        System.out.println("Your Character... ");
        System.out.println("- Name : "+ myCharacter.getName());
        System.out.println("- Class : "+ myCharacter.getType());
        System.out.println("- Health : "+ myCharacter.getHealth());
        System.out.println("- Power : "+ myCharacter.getStrength());
    }
    private String getNewName(Character myCharacter) {
        String newName;
        Scanner newObj = new Scanner(System.in);
        System.out.println("Edit your character's name :");
        newName = newObj.nextLine();
        System.out.println("Character updated, here are his info :");
        showCharacterInfo(myCharacter);
        return newName;
    }
}