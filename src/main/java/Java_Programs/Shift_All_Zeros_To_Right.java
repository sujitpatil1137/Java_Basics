package Java_Programs;

public class Shift_All_Zeros_To_Right {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 0, 4, 5};
        int index = 0;

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0){
               arr[index++] = arr[i];   // place non-zero at current index and increment index
            }
        }

        while (index < arr.length){
            arr[index++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
