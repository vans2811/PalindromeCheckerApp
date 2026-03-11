// Version 10.0
// Palindrome Checker App - Use Case 10
// Ignores spaces and case while checking palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer approach
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        while(start < end) {
            if(normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if(isPalindrome) {
            System.out.println("The string \"" + input + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome (ignoring spaces and case).");
        }

        System.out.println("Program Finished.");
    }
}