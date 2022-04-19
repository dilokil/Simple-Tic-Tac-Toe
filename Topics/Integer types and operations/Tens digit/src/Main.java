import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.next();
        int indexOfTensDigit = inputNumber.length() - 2;
        if (indexOfTensDigit < 0) {
            System.out.println(0);
        } else {
            System.out.println(inputNumber.charAt(indexOfTensDigit));
        }
    }
}