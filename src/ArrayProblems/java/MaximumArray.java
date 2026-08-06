package ArrayProblems.java;

public class MaximumArray {
    static void main() {
    int[] arr={11,32,4,4,33};
    int maxValue= arr[0];
    for(int i =0;i< arr.length;i++){
        if(arr[i]>maxValue) {

            //update
            maxValue = arr[i];
        }
    }
        System.out.println(maxValue );
}
}
