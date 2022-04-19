import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mas = inputArray(scanner);
        int val = scanner.nextInt();

        System.out.println(sumInArrayThenGreat(mas, val));
    }

    public static int sumInArrayThenGreat(int[] array, int value) {
        int result = 0;
        for (var el : array) {
            if (el > value) {
                result += el;
            }
        }
        return result;
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