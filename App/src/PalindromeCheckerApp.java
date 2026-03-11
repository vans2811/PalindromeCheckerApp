// Version 7.0
// Palindrome Checker App - Use Case 7
// Optimized palindrome check using Deque

import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while(deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if(front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome) {
            System.out.println("The string \"" + word + "\" is a Palindrome.");
        }
        else {
            System.out.println("The string \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program Finished.");
    }
}
