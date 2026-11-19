class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int left = 0;
        int right = 0;;


        for(int i = 0 ; i< n ; i++)
        {
            if(nums[i] %2 == 0 ){
                even[left++] = nums[i];
            }
            else{
                odd[right++] = nums[i];
            }
        }

        int[] ans = new int[n];
        int e = 0 , o = 0;
        for(int i = 0 ; i< n ; i++)
        {
            if(i %2 != 0) nums[i] = odd[o++];
            else  nums[i] = even[e++];

        }
        return nums;        
    }
}