import java.util.*;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Remove spaces and ignore case
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = processed.length() - 1;
        boolean isPalindrome = true;

        // Compare characters
        while (left < right) {
            if (processed.charAt(left) != processed.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        sc.close();
    }
}