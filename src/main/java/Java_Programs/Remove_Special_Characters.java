package Java_Programs;

public class Remove_Special_Characters {

    public static void main(String[] args) {

        String str = "Ja@va#123!";

        // keep only alphabets and digits
        String result = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("After removing special characters: " + result);
    }
}
