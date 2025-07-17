package JavaPrograms;

public class String_Immutability {

    public static void main(String[] args) {

        String str1="Hello";
        String str2="Hello";

        System.out.println("Are str1 and str2 the same? " +(str1==str2));

        str1 = str1 + " World";
        System.out.println("Are str1 and str2 the same? " +(str1==str2));

        System.out.println("str1: " +str1);
        System.out.println("str2: " +str2);
    }
}
