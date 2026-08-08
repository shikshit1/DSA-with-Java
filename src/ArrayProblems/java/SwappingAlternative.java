package ArrayProblems.java;

public class SwappingAlternative {
    static void main() {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }
        for(int k:arr){
            System.out.print(k+" ");
//        for(int i =0;i<n;i++){
//            System.out.print(arr[i]+" ");

        }
    }
}