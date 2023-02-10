package src;

import src.gear.Protection.GameBoard;
import src.Player.Character;

public class Main {
    public static void main(String[] args) {
        boolean gameState = true;
        while (gameState) {
            Menu m = new Menu();
            GameBoard board = new GameBoard();
            Character player = m.startMenu();
            Game game = new Game(player, board);
            game.run();
            gameState = game.restart();
        }
    }
}
