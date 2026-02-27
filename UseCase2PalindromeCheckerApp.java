public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed))
            System.out.println(word + " is a Palindrome.");
        else
            System.out.println(word + " is NOT a Palindrome.");
    }
}