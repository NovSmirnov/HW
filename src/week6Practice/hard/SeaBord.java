package week6Practice.hard;

import java.util.Arrays;

public class SeaBord {

    private String[][] field;

    public SeaBord() {
        field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(field[i],".");
        }
    }

    public String[][] getField() {
        return field;
    }

    public void shoot(int line, int column, String issue) {
        if ((line < 10 && line >= 0 && column < 10 && column >= 0) && (issue.equals("m") || issue.equals("h") || issue.equals("d"))) {
            field[line][column] = issue;
        }
    }

    public String check(int line, int column) {
        switch (field[line][column]) {
            case ".":
                if (column > 0) {
                    if (field[line][column - 1].equals("d")) {
                        return "#";
                    }
                }
                if (column < 9) {
                    if (field[line][column + 1].equals("d")) {
                        return "#";
                    }
                }
                if (line > 0) {
                    if (field[line - 1][column].equals("d")) {
                        return "#";
                    }
                }
                if (line < 9) {
                    if (field[line + 1][column].equals("d")) {
                        return "#";
                    }
                }
                return ".";
            case "m":
                return "#";
            case "h" :
            case "d":
                return "x";
            default:
                return ".";
        }

    }
}
