class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length ;

        int i = 0 ;
        int j = i+1;

        // First element check
        if(n == 1 || nums[0] > nums[1]) {
            return 0;
        }

        while(j < n)
        {
            if(nums[j] > nums[i])
            {
            i++;
            j++;
            if(j == n) return i;

            } 
            else{
                return i ;                
            }
        }
        return 0;
        
    }
}