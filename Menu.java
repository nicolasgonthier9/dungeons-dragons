import java.util.Objects;
import java.util.Scanner;
public class Menu {
    // Fonction pour montrer les infos du personnage créé.
    public void showCharacterInfo(String name, CharacterType type) {
        System.out.println("Your Character... ");
        System.out.println("- Name : "+ name);
        System.out.println("- His type : "+ type);
    }
    public void startMenu() {

        // J'initialise mes variables qui vont servir à sélectionner dans le menu et remplir les infos du personnage.
        String select;
        String charName;
        String newName = null;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Press 'enter' to create character");

        // Je simule un "press start" via le bouton Entrée.
        myObj.nextLine();
        System.out.println("Name your character :");

        // le nom du personnage sera celui indiqué dans le prompt.
        charName = myObj.nextLine();
        System.out.println("Will you play as 1 - Warrior or 2 - Wizard ?");

        // La valeur de type (enum CharacterType) dépendra de la valeur de select.
        CharacterType type;
        select = myObj.nextLine();
        if (Objects.equals(select, "1")) {
            type = CharacterType.Warrior;
        } else {
            type = CharacterType.Wizard;
        }
        System.out.println(charName + " is now a "+ type + " !");
        Character myCharacter = new Character(charName, type);

        // Création terminée, nouveau menu pour 1.modifier les infos, 2.voir les infos ou 3.lancer le jeu (à venir).
        System.out.println("1 - START");
        System.out.println("2 - Check your character");
        System.out.println("3 - Edit your character");
        select = myObj.nextLine();
        if (Objects.equals(select, "2")) {
            showCharacterInfo(charName, type);     // 1. Voir les infos
        } if (Objects.equals(select, "3")) {
            System.out.println("4 - Change name");
            System.out.println("5 - Change type");
            select = myObj.nextLine();
            if (Objects.equals(select, "4")) {
                Scanner newObj = new Scanner(System.in);                        // 2. Modifier les infos
                System.out.println("Edit your character's name :");
                newName = newObj.nextLine();
                System.out.println("Character updated, here are his info :");
                showCharacterInfo(newName, type);
            } if (Objects.equals(select, "5")) {
                System.out.println("1 - Warrior");
                System.out.println("2 - Wizard");
                select = myObj.nextLine();
                if (Objects.equals(select, "1")) {
                    type = CharacterType.Warrior;
                } else {
                    type = CharacterType.Wizard;
                }
                showCharacterInfo(charName, type);
                System.out.println("*GAME STARTING*");
            }
            myCharacter = new Character(newName, type);
        } else {                                           // 3. Lancer le jeu
            System.out.println("*GAME STARTING*");
            System.out.println("_________________");
            showCharacterInfo(charName, type);
        }
    }
}