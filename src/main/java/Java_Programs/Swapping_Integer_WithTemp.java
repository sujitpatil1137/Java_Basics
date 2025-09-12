package Java_Programs;

public class Swapping_Integer_WithTemp {

    public static void main(String[] args) {

        int a=5;
        int b=7;
        System.out.println("Before Swap: a= " +a +", b= "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap: a= " +a +", b= "+b);
    }
}
