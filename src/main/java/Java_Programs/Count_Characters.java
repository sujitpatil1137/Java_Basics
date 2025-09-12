package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Count_Characters {

    public static void main(String[] args) {

        String str = "programming";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c == ' ') continue; // skip spaces

            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1); // increase count
            } else {
                charCount.put(c, 1); // first time adding
            }
        }

        for (Character key : charCount.keySet()) {
            System.out.println(key + " → " + charCount.get(key));
        }
    }
}
