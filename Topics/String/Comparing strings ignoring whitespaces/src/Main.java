import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine().replace(" ", "");
        String secondString = scanner.nextLine().replace(" ", "");

        boolean outpBool = firstString.equals(secondString);

        System.out.println(outpBool);
    }
}