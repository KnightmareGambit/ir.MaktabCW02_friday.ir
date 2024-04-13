package Question03;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted numbers (in ascending order):");
        for (int number : numbers) {
            System.out.println(number);
        }

        input.close();
    }
}
