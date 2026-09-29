package BinarySearch.java;

public class SearchInRotatedSortedArrayII {
        public boolean search(int[] nums, int target) {

            int n = nums.length;

            int s = 0;
            int e = n - 1;

            while (s <= e) {

                int mid = s + (e - s) / 2;

                // Target mil gaya
                if (nums[mid] == target) {
                    return true;
                }

                // Duplicates
                if (nums[s] == nums[mid] && nums[mid] == nums[e]) {
                    s++;
                    e--;
                    continue;
                }

                // Left half sorted
                if (nums[s] <= nums[mid]) {

                    if (nums[s] <= target && target <= nums[mid]) {
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }

                }
                // Right half sorted
                else {

                    if (nums[mid] <= target && target <= nums[e]) {
                        s = mid + 1;
                    } else {
                        e = mid - 1;
                    }
                }
            }

            return false;
        }


        // MAIN METHOD
        public static void main(String[] args) {

            int[] nums = {2, 5, 6, 0, 0, 1, 2};
            int target = 0;

            SearchInRotatedSortedArrayII obj =
                    new SearchInRotatedSortedArrayII();

            boolean ans = obj.search(nums, target);

            System.out.println("Target found = " + ans);
        }
    }

