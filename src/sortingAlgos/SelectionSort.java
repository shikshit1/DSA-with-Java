package sortingAlgos;

public class SelectionSort {
       static void SelectionSort(int arr[]){
           //outer loop for rounds
           int n = arr.length;
           for(int i=0;i<n-1;i++){
               int minindex=i;
               //inner loop -> comparison between arr[j] and arr[minindex]
               for(int j=i+1;j<n;j++){
                   if(arr[j]< arr[minindex]){
                       minindex=j;
                   }
               }
               //jb comparison complete ho jayega
               //toh minindex wli ko correct positon or daal denge
               //swap arr[i], arr[minindex]
               int temp= arr[i];
               arr[i]= arr[minindex];
               arr[minindex]= temp;
           }
       }

    static void main() {
        int[] arr= {2,34,4,4,5,6,};
        SelectionSort(arr);
        System.out.println("printing the array:");
        for(int value: arr){
            System.out.print(value+ " ");
        }
    }
}
