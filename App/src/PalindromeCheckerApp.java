// Version 6.0
// Palindrome Checker App - Use Case 6
// Check palindrome using Queue (FIFO) and Stack (LIFO)

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to Queue and Stack
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while(!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if(fromQueue != fromStack) {
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