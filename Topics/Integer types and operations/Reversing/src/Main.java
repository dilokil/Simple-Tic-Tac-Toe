import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int resultNumber = 0;
        for (int i = 100; i >= 1; i /= 10) {
            resultNumber += (number % 10) * i;
            number /= 10;
        }
        System.out.println(resultNumber);
    }
}