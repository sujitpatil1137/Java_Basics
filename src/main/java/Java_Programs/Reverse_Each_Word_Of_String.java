package Java_Programs;

public class Reverse_Each_Word_Of_String {

    public static void main(String[] args) {

        String str = "My name is Sujit Patil";
        String[] words = str.split(" ");

        for (String word: words) {
            String res = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                res = res + word.charAt(i);
            }
            System.out.print(res + " ");
        }
    }
}
