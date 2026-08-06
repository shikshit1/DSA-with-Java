package ArrayProblems.java;

import java.util.Arrays;

public class PositiveOrNegativeSum {
    static  int[] getPosNegSum(int arr[]){
        int posSum=0;
        int negSum=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                //num is positive
                posSum= posSum+arr[i];
            }
            else{
                //num is negative
                negSum = negSum+ arr[i];
            }
        }
        int ans[] ={posSum,negSum};
        return ans;
    }


    static void main() {
        int arr[] ={3,344,-3,-3};
        int[] ans= getPosNegSum(arr);
        System.out.println("positive sum is "+ ans[0]);
        System.out.println("negative sum="+ans[1]);
    }
}
