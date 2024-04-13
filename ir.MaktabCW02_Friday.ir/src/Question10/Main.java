package Question10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5000; i++) {
            sb.append(i);
        }
        String concatenatedNumbers = sb.toString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of k (1 ≤ k ≤ 4000):");
        int k = scanner.nextInt();

        if (k < 1 || k > 4000) {
            System.out.println("Invalid input. Please enter a number between 1 and 4000.");
            return;
        }

        char result = concatenatedNumbers.charAt(k - 1);

        System.out.println("Output: " + result);

        scanner.close();
    }
}
