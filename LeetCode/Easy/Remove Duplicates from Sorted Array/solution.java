class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        // int[] expectedNums = new int[n];
        // for(int i = 1 ; i< n-1 ; i++)
        // {
        //     if(nums[i] != nums[i+1])
        //     {
        //         expectedNums[i] = nums[i];    
        //     }
        //     else
        //     {
        //         if(expectedNums[i] != nums[i])
        //         {
        //             expectedNums[i] = nums[i];
        //         }
        //     }
           
        // }
        // return expectedNums.length;

        int i = 0 , j = i+1;
        while(j < n)
        {
            if(nums[i] != nums[j])
            {
                i++;
               nums[i] = nums[j];               
            }            
                j++;
        }

        return i +1 ; 
    }
}