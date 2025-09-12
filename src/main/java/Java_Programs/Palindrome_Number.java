package Java_Programs;

public class Palindrome_Number {

    public static void main(String[] args) {

        int num = 121;
        int original = num;  // Save original number
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reverse = reverse * 10 + digit; // Add digit to reverse number
            num = num / 10;                // Remove last digit
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is NOT a Palindrome Number.");
        }

    }
}
