import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] masBool = {a > 0 ? 1 : 0, b > 0 ? 1 : 0, c > 0 ? 1 : 0};



        System.out.println(boolExpr(masBool));
    }

    public static boolean boolExpr(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum == 1;
    }



}