package Java_Programs;

public class First_Letter_Uppercase {

    public static void main(String[] args)
    {
        String str = "welcome to my code";
        String[] sp =  str.split(" ");
        String res = "";

       for (String word : sp)
       {
          char firstChar = word.charAt(0);
          String rest = word.substring(1); //Gets the rest of the word (from index 1 to end).
          res = res + Character.toUpperCase(firstChar) + rest + " ";
       }
       System.out.println(res);
    }
}
