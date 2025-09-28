package Java_Programs;

public class Reverse_Word_Order {

    public static void main(String[] args) {

        String str = "My name is Sujit Patil";
        String[] words = str.split(" ");
        String res = "";

        for (String word : words) {
            res = word + " " + res;  // Prepend word to result
        }

        System.out.println("Reversed Word Order: " + res.trim());
    }
}
