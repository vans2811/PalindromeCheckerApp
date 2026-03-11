// Version 13.0
// Palindrome Checker App - Use Case 13
// Compare performance of different palindrome algorithms

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "amanaplanacanalpanama"; // large string for performance demo

        System.out.println("Performance Comparison for word: " + word + "\n");

        // 1️⃣ Stack-Based Algorithm
        long startStack = System.nanoTime();
        boolean stackResult = checkPalindromeStack(word);
        long endStack = System.nanoTime();
        System.out.println("Stack-Based: Result = " + stackResult + ", Time = " + (endStack - startStack) + " ns");

        // 2️⃣ Deque-Based Algorithm
        long startDeque = System.nanoTime();
        boolean dequeResult = checkPalindromeDeque(word);
        long endDeque = System.nanoTime();
        System.out.println("Deque-Based: Result = " + dequeResult + ", Time = " + (endDeque - startDeque) + " ns");

        // 3️⃣ Two-Pointer Character Array Algorithm
        long startArray = System.nanoTime();
        boolean arrayResult = checkPalindromeCharArray(word);
        long endArray = System.nanoTime();
        System.out.println("Char Array Two-Pointer: Result = " + arrayResult + ", Time = " + (endArray - startArray) + " ns");

        System.out.println("\nPerformance comparison complete.");
    }

    // Stack-based palindrome
    public static boolean checkPalindromeStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome
    public static boolean checkPalindromeDeque(String word) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    // Character array two-pointer palindrome
    public static boolean checkPalindromeCharArray(String word) {
        char[] chars = word.toCharArray();
        int start = 0, end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}