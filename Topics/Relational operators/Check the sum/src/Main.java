import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(hasTwenty(a, b, c));
    }

    public static boolean hasTwenty(int a, int b, int c) {
        int TWENTY = 20;
        return a + b == TWENTY || a + c == TWENTY || b + c == TWENTY;
    }
}