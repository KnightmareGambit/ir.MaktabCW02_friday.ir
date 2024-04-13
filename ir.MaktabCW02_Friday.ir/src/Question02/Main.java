package Question02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters (excluding spaces): " + count);

        scanner.close();
    }
}
