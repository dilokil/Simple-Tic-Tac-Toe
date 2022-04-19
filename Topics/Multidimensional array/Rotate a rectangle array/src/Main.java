import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matr = inputArray(scanner);

        printArray(rotateMatrix(matr));

    }

    public static void printArray(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] oldMatrix) {
        int oldCountRow = oldMatrix.length;
        int oldCountColum = oldMatrix[0].length;
        int newCountRow = oldMatrix[0].length;
        int newCountColum = oldMatrix.length;
        int[][] newMartix = new int[newCountRow][newCountColum];

        for (int j = 0; j < oldCountColum; j++) {
            for (int i = oldCountRow - 1; i >= 0; i--) {
                newMartix[j][(oldCountRow - 1) - i] = oldMatrix[i][j];
            }
        }
        return newMartix;
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