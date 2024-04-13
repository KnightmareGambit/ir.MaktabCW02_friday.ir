package Question11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's triangle (1 <= n <= 10):");
        int n = scanner.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            return;
        }
        generatePascalTriangle(n);

        scanner.close();
    }

    public static void generatePascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

