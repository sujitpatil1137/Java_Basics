package JavaPrograms;

public class Max_Min_Element {

    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 89, 2, 44, 28};

        int max = arr[0]; //We assume the first element (12) is both the maximum and minimum initially.
        int min = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
