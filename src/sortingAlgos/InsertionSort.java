package sortingAlgos;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int curr=i;
            int prev= i-1;
            int currentvalue= arr[i];
            //shifting
            while (prev>=0&& currentvalue<arr[prev]){
                arr[prev+1]= arr[prev];
                prev--;
            }
            //ab khali jagh pr place the current value
            arr[prev+1] = currentvalue;
        }
    }

    static void main() {
        int[] arr= {3,5,6,7,8,4};
        insertionSort(arr);
        System.out.println("printing the array:");
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
