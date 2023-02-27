package src;

import src.game.Game;
import src.game.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu(g, sc);
        menu.run();
    }
}
