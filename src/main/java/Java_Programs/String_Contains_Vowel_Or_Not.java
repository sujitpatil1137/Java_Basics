package Java_Programs;

public class String_Contains_Vowel_Or_Not {

    public static void main(String[] args) {

        String str = "Welcome";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The string contains a vowel.");
                return;   // exit as soon as vowel is found
            }
        }
            System.out.println("The string does not contain a vowel.");


        /*
        if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
        {
            System.out.println("The string contains a vowel.");
        }
        else {
            System.out.println("The string does not contains a vowel.");
        }
        */
    }
}
