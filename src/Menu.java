package src;

import src.characters.Character;
import src.characters.player.Warrior;
import src.characters.player.Wizard;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private Game game;
    private final Scanner scanner;
    private boolean exit;
    public Menu (Game game, Scanner scanner) {
        this.game = game;
        this.scanner = scanner;
        this.exit = false;
    }

    public void run() {
        System.out.println("Welcome to D&D ! Press 'Enter' to start the game"); // PRESS START
        scanner.nextLine();
        while (!this.exit) {
            if (this.game.hasCharacter()) {
                System.out.println("Your character is ready to go !");
                System.out.println("- 1 - Edit Character");
                System.out.println("- 2 - Delete Character");
                System.out.println("- 3 - Show Character Info");
                System.out.println("- 4 - START");
            } else {
                System.out.println("- 1 - New Game");
            }
            System.out.println("- 9 - QUIT");
            int select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1 -> {
                    if (this.game.hasCharacter()) {
                        this.editCharacter(this.game.getCharacter());
                    } else {
                        Character character = this.createCharacter();
                        this.game.setCharacter(character);
                    }
                }
                case 2 -> {
                    // We check that there's already a player defined
                    if(this.game.hasCharacter()){
                        // if so we remove the currently defined player
                        this.game.unsetPlayer();
                        //this.game.setPlayer(null);
                    }
                }
                case 3 -> {
                    if (this.game.hasCharacter()){
                        System.out.println(this.game.getCharacter().toString());
                    }
                }
                case 4 -> {
                    // We check that there's already a player defined
                    // FIXME we should check if the game is ready to start (delegate that responsibility to the game object)
                    if(this.game.hasCharacter()){
                        // Then we run the game
                        this.startGame();
                    }
                }
                // The user which to exit (we break the main loop)
                case 9 ->{
                    System.out.println("Thank you for playing !");
                    this.exit = true;
                }
            }
        }
    }

    private Character createCharacter() {
        System.out.println("Name your character :");
        String name = this.scanner.nextLine();
        boolean correct;
        Character character = null;
        do {
            System.out.println("Choose your character's class :");
            System.out.println("- 1 - Warrior");
            System.out.println("- 2 - Wizard");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    correct = true;
                    character = new Warrior(name);
                }
                case 2 -> {
                    correct = true;
                    character = new Wizard(name);
                    System.out.printf("%s is now a %s !", name, character.getType());
                }
                default -> correct = false;
            }
        } while (!correct);
        return character;
    }

    private void startGame() {
        while (!this.game.hasFinishedGame()) {
//            System.out.println("Press 'enter' to throw the dice.");
//            scanner.nextLine();
            this.game.playTurn();
        }
        this.game = new Game();
    }
    private void editCharacter (Character character) {
        int select;
        System.out.println("- 1 - Edit Character name");
        System.out.println("- 2 - Change Character class");
        select = scanner.nextInt();
        scanner.nextLine();
        switch (select) {
            case 1 -> {
                System.out.println("Enter your character's name :");
                String newName = this.scanner.nextLine();
                this.game.getCharacter().setName(newName);
            }
            case 2 -> {
                String name = character.getName();
                switchCharacterClass(character, name);
            }
        }
    }

    private void switchCharacterClass(Character character, String name) {
        if (character.getType().equals("Wizard")) {
            this.game.setCharacter(new Warrior(name));
            System.out.printf("%s is now a Warrior !", name);

        }
        else if (character.getType().equals("Warrior")) {
            this.game.setCharacter(new Wizard(name));
            System.out.printf("%s is now a Wizard !", name);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "game=" + game +
                ", scanner=" + scanner +
                ", exit=" + exit +
                '}';
    }
}
