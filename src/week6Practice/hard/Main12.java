package week6Practice.hard;

import java.util.Arrays;

public class Main12 {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();
        board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        board.shoot(6, 9, "h");
        board.shoot(2, 1, "d");
        board.shoot(5, 6, "d");
        board.shoot(5, 3, "h");
        board.shoot(5, 2, "d");
//        board.shoot(0, 0, "d");



        String[][] df = board.getField();
        for (String[] i : df) {
            System.out.println(Arrays.toString(i));
        }

    }


}
