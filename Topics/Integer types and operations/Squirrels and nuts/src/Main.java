import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squirrelsCount = scanner.nextInt();
        int nutsCount = scanner.nextInt();

        System.out.println(nutsCount % squirrelsCount);
    }
}