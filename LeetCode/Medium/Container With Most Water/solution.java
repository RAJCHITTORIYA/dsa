class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n -1;
        int area = 0;
        int maxArea = 0;

        while (left < right) {
            // Calculate area using the shorter line and distance between pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            
            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
        
    }
}