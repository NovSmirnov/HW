package week6Practice.hard;

import java.util.Arrays;

public class SeaBoard {
    private String[][] field;

    public SeaBoard() {
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
            String ch = check(line, column);
            field[line][column] = ch;

        }
    }

    public String check(int line, int column) {
        switch (field[line][column]) {
            case "m":
                return "#";
            case "h":
                return "x";
            case "d":
                for (int i = 1; i < 4; i++) {
                    if (column - i >= 0) {
                        if (field[line][column - i].equals("x")) {
                            if (line - 1 >= 0) {
                                field[line - 1][column - i] = "#";
                            }
                            if (line + 1 <= 9) {
                                field[line + 1][column - i] = "#";
                            }
                        } else if (field[line][column - i].equals(".") || field[line][column - i].equals("#")) {
                            field[line][column - i] = "#";
                            if (line - 1 >= 0) {
                                field[line - 1][column - i] = "#";
                            }
                            if (line + 1 <= 9) {
                                field[line + 1][column - i] = "#";
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (int i = 1; i < 4; i++) {
                    if (column + i <= 9) {
                        if (field[line][column + i].equals("x")) {
                            if (line - 1 >= 0) {
                                field[line - 1][column + i] = "#";
                            }
                            if (line + 1 <= 9) {
                                field[line + 1][column + i] = "#";
                            }
                        } else if (field[line][column + i].equals(".") || field[line][column + i].equals("#")) {
                            field[line][column + i] = "#";
                            if (line - 1 >= 0) {
                                field[line - 1][column + i] = "#";
                            }
                            if (line + 1 <= 9) {
                                field[line + 1][column + i] = "#";
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (int i = 1; i < 4; i++) {
                    if (line - i >= 0) {
                        if (field[line - i][column].equals("x")) {
                            if (column - 1 >= 0) {
                                field[line - i][column - 1] = "#";
                            }
                            if (column + 1 <= 9) {
                                field[line - i][column + 1] = "#";
                            }
                        } else if (field[line - i][column].equals(".") || field[line - i][column].equals("#")) {
                            field[line - i][column] = "#";
                            if (column - 1 >= 0) {
                                field[line - i][column - 1] = "#";
                            }
                            if (column + 1 <= 9) {
                                field[line - i][column + 1] = "#";
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (int i = 1; i < 4; i++) {
                    if (line + i <= 9) {
                        if (field[line + i][column].equals("x")) {
                            if (column - 1 >= 0) {
                                field[line + i][column - 1] = "#";
                            }
                            if (column + 1 <= 9) {
                                field[line + i][column + 1] = "#";
                            }
                        } else if (field[line + i][column].equals(".") || field[line + i][column].equals("#")) {
                            field[line + i][column] = "#";
                            if (column - 1 >= 0) {
                                field[line + i][column - 1] = "#";
                            }
                            if (column + 1 <= 9) {
                                field[line + i][column + 1] = "#";
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return "x";
            default:
                return ".";
        }
    }
}
