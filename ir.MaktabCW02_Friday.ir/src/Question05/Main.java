package Question05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        // Get numbers from the user and save them into the array
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        removeDuplicates(numbers);

        System.out.println("Array after removing duplicates:");
        for (int number : numbers) {
            if (number != Integer.MIN_VALUE) {
                System.out.println(number);
            }
        }

        scanner.close();
    }

    public static void removeDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
        }
    }

}
