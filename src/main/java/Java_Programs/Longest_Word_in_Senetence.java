package Java_Programs;

public class Longest_Word_in_Senetence {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        String[] words = str.split(" ");
        String longest = "";

        for (String word : words)
        {
            if (word.length() > longest.length())
            {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
