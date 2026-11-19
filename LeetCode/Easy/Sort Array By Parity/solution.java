class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        // int[] even = new int[n];
        // int[] odd = new int[n];

        // int e = 0 , o = 0 ;

        // for(int i = 0 ; i< n ; i++)
        // {
        //     if(nums[i]%2 == 0)
        //     {
        //         even[e++] = nums[i];
        //     }else{
        //         odd[o++] = nums[i];
        //     }
        // }

        // int k = 0 ;
        // for(int i = 0 ; i< e; i++)
        // {
        //     nums[k++] = even[i];
        // }

        // for(int i = 0 ; i< o; i++)
        // {
        //     nums[k++] = odd[i];
        // }
        // return nums;

        // int[] ans = new int[n];
        // int left = 0 ;
        // int right = n-1;
        // int k = 0 ;   

        // for(int i = 0 ; i< n ; i++)
        // {
         
        //     if(nums[i] %2 == 0)
        //     {
        //         ans[left++] = nums[i];
        //     }
        //     else{
        //         ans[right--] = nums[i];
               
        //     }
        // }        
        // return ans;

        int i = 0 , j = n-1;
        while(i<j)
        {
            if(nums[i] %2 == 0)i++;
            else if(nums[j]  % 2 != 0)j--;
            else
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

}
