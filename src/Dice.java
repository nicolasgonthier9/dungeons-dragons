package src;

import java.util.Random;

public class Dice {
    private final Random random;
    public Dice() {
        this.random = new Random();
    }
    public int throwDice() {
        return this.random.nextInt(1,7);
    }
}

