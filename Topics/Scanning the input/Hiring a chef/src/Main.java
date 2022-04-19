import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chefName = scanner.next();
        String yearsOfExp = scanner.next();
        String cuisinePreference = scanner.next();
        System.out.println("The form for " + chefName +
                " is completed. We will contact you if we need a chef who cooks " + cuisinePreference +
                " dishes and has " + yearsOfExp + " years of experience.");
    }
}
