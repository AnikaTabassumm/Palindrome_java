package palindrometest;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        
        String Str = input.toLowerCase();

        int i = 0;
        int j = Str.length() - 1;
        while (i < j) {
            if (Str.charAt(i) != Str.charAt(j)) {
                return false; 
            }
            i++;
            j--;
        }
        return true;
    }
}