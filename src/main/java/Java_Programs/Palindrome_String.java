package Java_Programs;

public class Palindrome_String {

    public static void main(String[] args) {

        String input = "madam";

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
