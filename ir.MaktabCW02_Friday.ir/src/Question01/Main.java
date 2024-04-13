package Question01;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOne = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arrayOne[i] = scanner.nextInt();
        }

        int[] arrayTwo = new int[arrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayTwo[i] = arrayOne[i];
        }

        System.out.println("Numbers copied to arrayTwo:");
        for (int number : arrayTwo) {
            System.out.println(number);
        }

        scanner.close();
    }
}
