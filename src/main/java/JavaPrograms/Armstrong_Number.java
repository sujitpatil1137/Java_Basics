package JavaPrograms;

public class Armstrong_Number {

    public static void main(String[] args) {
        int num = 153;             // Number to check
        int original = num;        // Store original value for final comparison
        int result = 0;            // Will hold the sum of digits raised to power

        int digits = String.valueOf(num).length();  // Count number of digits

        // Loop to extract digits and compute power
        while (num > 0) {
            int digit = num % 10;                  // Get last digit
            result += Math.pow(digit, digits);     // Add digit^digits to result
            num /= 10;                              // Remove last digit
        }

        // Compare result with original
        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

}
