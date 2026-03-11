// Version 12.0
// Palindrome Checker App - Use Case 12
// Demonstrates Strategy Pattern to choose palindrome algorithm dynamically

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

// Main application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Choose strategy dynamically (Stack or Deque)
        PalindromeStrategy strategy;

        // Example: Use DequeStrategy
        strategy = new DequeStrategy();

        PalindromeContext context = new PalindromeContext(strategy);

        if (context.checkPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome (using "
                    + strategy.getClass().getSimpleName() + ").");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome (using "
                    + strategy.getClass().getSimpleName() + ").");
        }

        // Example: Switch to StackStrategy at runtime
        strategy = new StackStrategy();
        context.setStrategy(strategy);

        if (context.checkPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a Palindrome (using "
                    + strategy.getClass().getSimpleName() + ").");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome (using "
                    + strategy.getClass().getSimpleName() + ").");
        }
    }
}

// Strategy interface
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String word) {
        return strategy.isPalindrome(word);
    }
}
// Version 13.0
