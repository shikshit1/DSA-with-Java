package ArrayProblems.java;

public class PivotIndex {
    public int pivotindex(int[] nums){
        int rightsum=0;
        for(int num: nums){
            rightsum+=num;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            //update the right sum
            rightsum-=nums[i];
            //check if the leftsum and right sum are equal
            if(leftsum==rightsum){
                return i;
                leftsum+=nums[i];
            }
            //if not any equal then return -1
            return -1;
        }

    }



}
