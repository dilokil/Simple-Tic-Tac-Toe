class ArrayOperations {
    static int THIRD_ROW = 2;

    public static void printTheThirdRow(int[][] twoDimArray) {

        for (int i = 0; i < twoDimArray[THIRD_ROW].length; i++) {
            System.out.print(twoDimArray[THIRD_ROW][i] + " ");
        }

    }
}
