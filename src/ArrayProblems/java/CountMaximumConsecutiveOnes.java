package ArrayProblems.java;

public class CountMaximumConsecutiveOnes {
    public int CountMaximumConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }

    static void main() {
        int[] nums= {1,1,0,5,1,1,1,1};
        CountMaximumConsecutiveOnes obj = new CountMaximumConsecutiveOnes();
        int ans= obj.CountMaximumConsecutiveOnes(nums);
        System.out.println(ans);

    }
}
