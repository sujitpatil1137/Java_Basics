package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicates_From_Array {

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 2, 5, 9, 1};

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        System.out.println("Array after removing duplicates: " + list);
    }
}
