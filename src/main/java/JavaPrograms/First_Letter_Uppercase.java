package JavaPrograms;

public class First_Letter_Uppercase {

    public static void main(String[] args)
    {
        String str = "welcome to my code";
        String[] sp =  str.split(" ");
        String res = " ";

       for (String s : sp)
       {
          char c = s.charAt(0);
          String sub = s.substring(1);
          res = res + Character.toUpperCase(c) + sub + " ";
       }
       System.out.println(res);
    }
}
