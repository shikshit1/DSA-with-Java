package ArrayProblems.java;

import java.util.ArrayList;
import java.util.List;

public class SumOfEachCol2DArray {
    public List<Integer> colsum(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
                int value = matrix[row][col];
                sum = sum + value;
            }
            result.add(sum);
        }
        return result;
    }

    static void main() {
        int[][] nums = {{1,2,3,},
                {4,5,6},
                {7,8,9}
        };
        SumOfEachCol2DArray obj = new SumOfEachCol2DArray();
        List<Integer> result = obj.colsum(nums);
        System.out.println(result);

    }
}
