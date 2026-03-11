// Version 2.0
// Palindrome Checker App - Use Case 2
// Checks whether a hardcoded string is a palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome condition
        if(word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        }
        else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Finished.");
    }
}