package Java_Programs;

public class Reverse_Word_Order {

    public static void main(String[] args) {

        String s = "my name is sujit";
        String[] words = s.split(" ");

        for (int i = words.length - 1; i >= 0; i--)
        {
            System.out.print(words[i] + " ");
        }
    }
}
