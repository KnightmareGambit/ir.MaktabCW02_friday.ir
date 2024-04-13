package Question07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.next();

        char ch;
        String reversedStr = "" ;

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reversedStr= ch+reversedStr;
        }

        if(str.equals(reversedStr)){
            System.out.println("Give string is palindrome");
        }else{
            System.out.println("Give string is not palindrome");
        }
    }
}
