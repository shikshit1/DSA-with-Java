package ArrayProblems.java;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachRow2DArray {
    public List<Integer> rowsum(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int m= arr.length;
        int n= arr[0].length;
         for(int row= 0;row<m;row++){
             int sum=0;
             for(int col= 0;col<n;col++){
                 int value= arr[row][col];
                 sum= sum+value;
             }
             result.add(sum);
         }
         return result;
    }

    static void main() {
        int[][] arr = {
                {32, 4, 4},
                {4, 4, 4},
                {33,3,3},
        };

        SumOfEachRow2DArray obj = new SumOfEachRow2DArray();

        List<Integer> result = obj.rowsum(arr);

        System.out.println(result);
    }
}
