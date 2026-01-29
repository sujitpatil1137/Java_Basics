package Java_Programs;

public class Shift_All_Zeros_To_Left {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 5};
        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        while (index >= 0) {
            arr[index--] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
