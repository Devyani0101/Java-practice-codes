import java.util.Scanner;

public class Diya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;  

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Compound interest formula
        amount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f\n", years, amount);

        scanner.close();
    }
}
