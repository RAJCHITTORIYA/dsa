class Solution {
    public int pivotIndex(int[] nums) {
         int n = nums.length;

        int sumLeft = 0;
        int sumRight = 0;

        int[] prefixSum = new int[n];

        prefixSum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        int totalSum = prefixSum[n - 1];

        for (int i = 0; i < n; i++) {

            sumRight = totalSum - sumLeft - nums[i];

            if (sumLeft == sumRight) {
                return i;
            }

            sumLeft += nums[i];
        }

        return -1;
        
    }
}