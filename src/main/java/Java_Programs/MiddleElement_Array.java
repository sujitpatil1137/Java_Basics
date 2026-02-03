package Java_Programs;

public class MiddleElement_Array {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int size = arr.length;

        int firstMiddle = (size / 2) - 1;
        int secondMiddle = size / 2;

        System.out.println("Middle elements are: "
                + arr[firstMiddle] + " and " + arr[secondMiddle]);

    }
}
