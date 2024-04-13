package Question04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int thirdLargest = findThirdLargest(numbers);
        System.out.println("Third largest number in the array: " + thirdLargest);

        input.close();
    }

    public static int findThirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > first) {
                third = second;
                second = first;
                first = j;
            } else if (j > second && j != first) {
                third = second;
                second = j;
            } else if (j > third && j != second && j != first) {
                third = j;
            }
        }

        return third;
    }
}
