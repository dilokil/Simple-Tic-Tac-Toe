package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner s = new Scanner(System.in);
        char[][] matrix = inputField("_________");
        printField(matrix);
        char curPLayer = 'X';
        String curState = "Game not finished";
        while (curState == "Game not finished") {
            oneTurn(matrix, s, curPLayer);
            printField(matrix);
            curState = checkField(matrix);
            curPLayer = curPLayer == 'X' ? 'O' : 'X';
        }
        System.out.println(curState);
    }

    public static void oneTurn(char[][] startField, Scanner s, char player) {
        while (true) {
            System.out.print("Enter the coordinates: ");
            if (!s.hasNextInt()) {
                System.out.println("You should enter numbers!");
                s.next();
                s.next();
                continue;
            }
            int firstIndex = s.nextInt();
            if (!s.hasNextInt()) {
                System.out.println("You should enter numbers!");
                s.next();
                continue;
            }
            int secondIndex = s.nextInt();
            if (firstIndex < 1 || firstIndex > 3 || secondIndex < 1 || secondIndex > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (startField[firstIndex - 1][secondIndex - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            startField[firstIndex - 1][secondIndex - 1] = player;
            break;
        }
    }

    public static int[] countCells(char[][] field) {
        int[] count = new int[]{0, 0, 0};
        for (var line : field) {
            for (var el : line) {
                if (el == 'X') count[0]++;
                if (el == 'O') count[1]++;
                if (el == '_') count[2]++;
            }
        }
        return count;
    }

    public static char checkWinLine(char[][] field, int index) {
        if (field[index][0] == field[index][1] && field[index][1] == field[index][2] ||
                field[0][index] == field[1][index] && field[1][index] == field[2][index]) {
            return field[index][index];
        }
        if (index == 0) {
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                return field[0][0];
            }
        }
        if (index == 2) {
            if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[1][1] != '_') {
                return field[1][1];
            }
        }

        return '_';
    }

    public static String checkField(char[][] field) {
        int[] count = countCells(field);
        if (Math.abs(count[0] - count[1]) >= 2) return "Impossible";

        char resultWinChar = '_';
        for (int i = 0; i < field.length; i++) {
            char checkWinChar = checkWinLine(field, i);
            if (checkWinChar == 'X' || checkWinChar == 'O') {
                resultWinChar = checkWinChar;
            }
        }
        if (resultWinChar != '_') {
            return resultWinChar + " wins";
        }
        if (count[2] == 0) {
            return "Draw";
        } else {
            return "Game not finished";
        }

    }

    public static char[][] inputField(String stringField) {
        char[][] matrixField = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixField[i][j] = stringField.charAt(i * 3 + j);
            }
        }
        return matrixField;
    }

    public static void printField(char[][] field) {
        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}