// Version 11.0
// Palindrome Checker App - Use Case 11
// Encapsulates palindrome logic in a dedicated class (OOP)

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(input);

        // Check palindrome
        if (checker.checkPalindrome()) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Finished.");
    }
}

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    private String word;

    // Constructor
    public PalindromeChecker(String word) {
        this.word = word;
    }

    // Public method to check if the word is a palindrome
    public boolean checkPalindrome() {

        // Use Stack internally to check palindrome
        Stack<Character> stack = new Stack<>();

        // Push all characters onto stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Compare stack pop with original string
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}