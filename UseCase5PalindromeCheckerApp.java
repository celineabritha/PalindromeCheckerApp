import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        sc.close();
    }
}