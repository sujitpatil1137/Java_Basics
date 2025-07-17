package JavaPrograms;

import java.util.Collections;
import java.util.TreeSet;

public class Sort_Elements_From_Array {

    public static void main(String[] args) {

        int[] a = {55, 22, 17, 87, 93};

        TreeSet<Integer> t = new TreeSet<>();
        //TreeSet<Integer> t = new TreeSet<>(Collections.reverseOrder());   //For descending order

        for (int j : a) {
            t.add(j);
        }
        System.out.println(t);
    }
}
