package Question06;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        } else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1, string2)) {
                System.out.println("Both the strings are anagram");
            } else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}

