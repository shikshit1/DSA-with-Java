package ArrayProblems.java;

public class Multiplyby10 {
    static int[] multiplyby10(int[] arr) {
        int n = arr.length;
        int[] newarr = new int[n];

        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i] * 10;
        }
        // return updated array
        return newarr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 32, 23, 3};

        int[] ans = multiplyby10(arr);

        System.out.println("Printing ans array:");

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
