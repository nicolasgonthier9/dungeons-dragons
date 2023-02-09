package src;

public class Main {
    public static void main(String[] args) {
        Menu m = new Menu();
        Character player = m.startMenu();
        Game game = new Game(player);
        game.run();
    }
}
