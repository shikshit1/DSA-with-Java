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
            }
            leftsum+=nums[i];

            //if not any equal then return -1
        }
        return -1;


    }

    static void main() {

        int[] nums = {1, 7, 3, 6, 5, 6};
        PivotIndex obj = new PivotIndex();

        int ans = obj.pivotindex(nums);

        System.out.println("Pivot Index = " + ans);

    }



}
