package Java_Programs;

import java.util.Arrays;

public class Second_Largest_Element {

    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 89, 2, 44, 28};

        Arrays.sort(arr); // Sort in ascending order

        int n = arr.length;
        int largest = arr[n - 1]; // last element is largest
        int secondLargest = arr[n - 2]; // second last is second largest

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
