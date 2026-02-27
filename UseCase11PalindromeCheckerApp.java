import java.util.Scanner;

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Normalize input
        input = input.replaceAll("\\s+", "").toLowerCase();

        int length = input.length();

        // Internal Array (acts like stack)
        char[] stack = new char[length];
        int top = -1;

        // Push characters into stack
        for (int i = 0; i < length; i++) {
            stack[++top] = input.charAt(i);
        }

        boolean isPalindrome = true;

        // Compare using pop operation
        for (int i = 0; i < length; i++) {
            char popped = stack[top--];

            if (input.charAt(i) != popped) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("The given string is a Palindrome.");
        else
            System.out.println("The given string is NOT a Palindrome.");

        sc.close();
    }
}