package Java_Programs;

public class Prime_Number {

    public static void main(String[] args) {

        int num = 29;
        boolean isPrime = true;

        if(num <=1) {
            isPrime=false;
        }
        else {
            for (int i=2; i<=num/2; i++)    // // loop from 2 to half of num
            {
                if(num % i == 0){       // if num is divisible by i
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
