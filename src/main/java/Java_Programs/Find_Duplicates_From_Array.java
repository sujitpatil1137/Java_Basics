package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicates_From_Array {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 4, 7, 8, 5, 9};

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int num : arr) {
            if (!uniqueNumbers.add(num)) {
                duplicateNumbers.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicateNumbers);
    }
}
