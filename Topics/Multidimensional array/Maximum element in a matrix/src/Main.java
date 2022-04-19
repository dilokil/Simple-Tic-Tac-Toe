import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ans = getIndexOfFirstMax(inputArray(scanner));
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] getIndexOfFirstMax(int[][] array) {
        int[] xAndY = new int[2];
        xAndY[0] = 0;
        xAndY[1] = 0;
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    xAndY[0] = i;
                    xAndY[1] = j;
                    maxElement = array[i][j];
                }
            }
        }
        return xAndY;
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