package Java_Programs;

public class Count_Char_from_String {

    public static void main(String[] args) {

        String input = "Java is Amazing and Awesome";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Number of 'a' is: " + count);
    }
}
