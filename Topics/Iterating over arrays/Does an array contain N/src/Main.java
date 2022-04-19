import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mas = inputArray(scanner);
        int numberN = scanner.nextInt();

        System.out.println(findNumberInArray(mas, numberN));
    }

    public static boolean findNumberInArray(int[] array, int numN) {
        boolean find = false;
        for (int i = 0; i < array.length && !find; i++) {
            find = array[i] == numN;
        }
        return find;
    }

    public static int[] inputArray(Scanner s) {
        int size = s.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = s.nextInt();
        }
        return result;
    }
}
