import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.next();
        System.out.println(inputWord.charAt(0) == 'J' || inputWord.charAt(0) == 'j');
    }
}