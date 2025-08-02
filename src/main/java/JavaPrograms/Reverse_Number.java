package JavaPrograms;

public class Reverse_Number {

    public static void main(String[] args) {

        int number = 12345;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10; //% (modulus) gives the remainder. For example, 12345 % 10 = 5
            rev = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
