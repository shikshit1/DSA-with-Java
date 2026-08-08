package ArrayProblems.java;

public class ShiftArrayBy1postion {
    static void shiftby1(int[] arr){
        //step 1: store last wale ki value
        int n = arr.length;
        int temp = arr[n-1];
        //step 2: shift all the value of array
        for(int i=n-1;i>0;i--){
            arr[i]= arr[i-1];
        }
        //step 3: temp ki  value ko 0 index pr copy
        arr[0]= temp;
    }

    static void main() {
        int arr[]= {1,2,3,4,5};
        shiftby1(arr);
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}
