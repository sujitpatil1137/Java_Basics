package JavaPrograms;

import java.util.Collections;
import java.util.TreeSet;

public class Sort_Elements_From_Array {

    public static void main(String[] args) {

        int[] arr = {55, 22, 17, 87, 93};

        TreeSet<Integer> treeSet = new TreeSet<>();
        //TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());   //For descending order

        for (int num : arr) {
            treeSet.add(num);
        }
        System.out.println(treeSet);
    }
}
