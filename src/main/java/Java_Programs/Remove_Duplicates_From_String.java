package Java_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_From_String {

    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new LinkedHashSet<>(); // keeps insertion order

        for (char c : str.toCharArray()) {
            set.add(c);  // duplicate chars won't be added again
        }

        StringBuilder result = new StringBuilder();

        for (char c : set) {
            result.append(c);
        }

        System.out.println("After Removing Duplicates: " + result);
    }
}
