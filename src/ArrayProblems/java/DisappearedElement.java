package ArrayProblems.java;

import java.util.*;

public class DisappearedElement {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
      // marked visited element to negative element
        for (int index = 0; index < n; index++) {

            int value = Math.abs(nums[index]); // bcz if a number is already negative
            int position = value - 1;

            // aagr phle se koii negative hai toh usko negative bana do
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }
            // now check the index of  , if nums[i] is positive then i+1 on their index
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> ans = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + ans);
    }
}