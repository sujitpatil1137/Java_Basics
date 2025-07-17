package JavaPrograms;

public class Vowels_Consonants_Counter {

    public static void main(String[] args) {

        String str = "Hello World";
        str = str.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(char ch : str.toCharArray())
        {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
