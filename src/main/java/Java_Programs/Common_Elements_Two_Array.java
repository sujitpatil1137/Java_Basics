package Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class Common_Elements_Two_Array {

    public static void main(String[] args) {

        int[] arr1 = {4, 5, 6, 4, 7, 8, 5, 9};
        int[] arr2 = {4, 5, 8, 4, 1, 3, 2, 1};

        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }
        System.out.print("Common elements: " +common);
    }
}
