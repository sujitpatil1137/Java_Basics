package Java_Programs;

public class String_Contains_Vowel_Or_Not {

    public static void main(String[] args) {

        String str = "Welcome";
        str = str.toLowerCase();

        if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u"))
        {
            System.out.println("The string contains a vowel.");
        }
        else {
            System.out.println("The string does not contains a vowel.");
        }

                // OR //  But its better to use loop

     /*   boolean hasVowel = false;

        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                hasVowel=true;
                break;
            }
        }

        if (hasVowel){
            System.out.println("The string contains a vowel.");
        }
        else {
            System.out.println("The string does not contains a vowel.");
        }

      */

    }
}
