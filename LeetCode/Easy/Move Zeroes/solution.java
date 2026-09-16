class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int NumberOfZero = 0;

        // step - 1  count the number of zero's

        for(int ele : nums)
        {
            if(ele == 0)
            {
                NumberOfZero++;
            }
        }

        // step - 2 shift the non zero numbers to the start of the array

        int index = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] != 0)
            {
                nums[index] = nums[i];
                index++;
            }
        }

        // step -3 placing zero to the last of the array

        for(int i = n - 1 ; i >=0; i--)
        {            
            if(NumberOfZero > 0)
            {

                nums[i] = 0;
                NumberOfZero--;

            }
        } 
    }
}