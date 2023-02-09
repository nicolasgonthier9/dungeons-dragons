package src;

public class Main {
    public static void main(String[] args) {
        boolean gameState = true;
        while (gameState) {
            Menu m = new Menu();
            Character player = m.startMenu();
            Game game = new Game(player);
            game.run();
            gameState = game.restart();
        }
    }
}
