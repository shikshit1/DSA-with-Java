package sortingAlgos;

public class BubbleSort {
        static void BubbleSort(int[] arr){
            int n = arr.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        //swapping
                        int temp= arr[j];
                          arr[j]= arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }

    static void main() {
        int[] arr= {1,22,4,4,5,3,7};
        BubbleSort(arr);
        System.out.println("printing the array:");
        for(int value: arr){
            System.out.print(value  +" ");
        }
    }
}
