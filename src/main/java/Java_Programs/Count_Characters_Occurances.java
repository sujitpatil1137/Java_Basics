package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Count_Characters_Occurances {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);   //This line checks if the character exists in the map, gets its current count or 0, increments it by 1, and stores it back.
        }
        System.out.println(map);
    }
}
