class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int left = 0;
        int right = n -1 ;

        if(n == 1)
        {
            if(nums[0] == target)
            {
                return 0;
            }
            else{
                return -1;
            }
        }

        while(left <= right )
        {
            int mid = (left + right)/2 ;

            if(target == nums[mid]) return mid;


             // Check whether left half is sorted
            if (nums[left] <= nums[mid]) {

                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }

            // Otherwise right half is sorted
            else {

                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}