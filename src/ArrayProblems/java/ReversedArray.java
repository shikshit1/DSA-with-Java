package ArrayProblems.java;

public class ReversedArray {
    static void reverse(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            //swag
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // i ko agee badao
            i++;
            //j ko niche lao
            j--;
        }
        //now array has been reversed
        //print
        for (int k : arr) {
            System.out.println(k);
        }
    }
        static void main () {
        int arr[] ={21,3,24,2,2,3};
        reverse(arr);

        }

}
