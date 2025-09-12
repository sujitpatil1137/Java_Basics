package Java_Programs;

public class Reverse_String {

    public static void main(String[] args) {

        String str = "SELENIUM";
        String res = "";

        for (int i=str.length()-1 ; i>=0 ; i--)
        {
            res = res + str.charAt(i);
        }
        System.out.println("Reversed String: " +res);
    }
}
