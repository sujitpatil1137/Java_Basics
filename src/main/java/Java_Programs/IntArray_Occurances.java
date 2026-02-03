package Java_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntArray_Occurances {

    public static void main(String[] args) {

        int[] arr = {32, 54, 65, 76, 78, 32, 32, 54};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
