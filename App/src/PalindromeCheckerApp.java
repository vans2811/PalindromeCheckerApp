// Version 9.0
// Palindrome Checker App - Use Case 9
// Check palindrome using recursion

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "deified";

        if (isPalindromeRecursive(word, 0, word.length() - 1)) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Finished.");
    }

    // Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition: if pointers cross or meet
        if (start >= end) {
            return true;
        }

        // Check characters at start and end
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
}
