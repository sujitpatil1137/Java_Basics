package JavaPrograms;

import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        scanner.close();
    }
}
