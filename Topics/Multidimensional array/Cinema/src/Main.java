import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] cinema = inputArray(scanner);
        int desiredSpaces = scanner.nextInt();

        System.out.println(getRowWithEmptySpaces(cinema, desiredSpaces));

    }

    public static int getRowWithEmptySpaces(int[][] cinema, int desiredSpaces) {
        int result = -1;

        for (int i = 0; i < cinema.length && result == -1; i++) {
            for (int j = 0; j < cinema[i].length - (desiredSpaces - 1) && result == -1; j++) {
                if (cinema[i][j] == 0) {
                    boolean find = true;
                    for (int k = 1; k < desiredSpaces && find; k++) {
                        if (cinema[i][j + k] != 0) {
                            find = false;
                            j += k;
                        }
                    }
                    if (find) {
                        result = i;
                    }
                }
            }
        }
        return result + 1;
    }

    public static int[][] inputArray(Scanner s) {
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = s.nextInt();
            }
        }
        return result;
    }
}