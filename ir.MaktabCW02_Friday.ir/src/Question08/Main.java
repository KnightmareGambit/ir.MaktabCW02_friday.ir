package Question08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        String numStr = String.valueOf(num);
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            int repeatCount = Character.getNumericValue(digit);
            for (int j = 0; j < repeatCount; j++) {
                System.out.print(digit);
            }
            System.out.println();

        }
        input.close();

    }
}
