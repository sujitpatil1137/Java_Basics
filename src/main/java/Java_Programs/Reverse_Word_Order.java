package Java_Programs;

public class Reverse_Word_Order {

    public static void main(String[] args) {

        String str = "My name is Sujit Patil";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {  //words.length - 1 --> Patil
            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }
        System.out.println("Reversed Word Order: " + result);
    }
}
