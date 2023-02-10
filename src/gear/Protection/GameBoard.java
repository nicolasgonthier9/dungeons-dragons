package src.gear.Protection;

import java.util.Random;

public class GameBoard {
    private final int cratePosition;
    public GameBoard() {
        Random r = new Random();
        this.cratePosition = r.nextInt(1,63);
    }
    public int getCratePosition() {
        return cratePosition;
    }
    public int checkCase (int pick, int cratePosition, int playerPosition) {
        if (playerPosition == cratePosition) {
            System.out.println("You encounter : A CRATE !");
            System.out.println("You open it and take the item");
            // C'est ICI que je dirai quoi faire avec le contenu des Crates : D'abord je return true et
            // quand la condition sera remplie je return false via la fonction que j'aurai créée.
            return pick = 0;
        }
        return pick;
    }
}

//    int[] gameBoard = {
//            1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,
//            17,18,19,20,21,22,23,24,25,26,27,28,
//            29,30,31,32,33,34,35,36,37,38,39,40,
//            41,42,43,44,45,46,47,48,49,50,51,52,
//            53,54,55,56,57,58,59,60,61,62,63,64
//    }; créer la List et y ajouter le board