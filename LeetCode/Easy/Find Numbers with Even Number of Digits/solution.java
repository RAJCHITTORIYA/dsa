class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        int evenNumber= 0;
        int n = nums.length;

        for(int i = 0 ; i<n ; i++)
        {
            while(nums[i] != 0)
            {
                nums[i] = nums[i]/10;
                count++;
            }
            if(count%2 == 0)
            {
                evenNumber++;
            }
            count = 0;
        }

        return evenNumber;
        
    }
}