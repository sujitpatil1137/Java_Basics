package Java_Programs;

public class Armstrong_Number {

    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int reverse = 0;            // Will hold the sum of digits raised to power

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse + digit*digit*digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

}
