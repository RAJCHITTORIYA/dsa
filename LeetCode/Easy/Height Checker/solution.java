class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];


        for(int i = 0 ; i< n ; i++)
        {
            expected[i] = heights[i];
        }
        Arrays.sort(heights);
        int j = 0 ;
        int count = 0;
        while(j < n)
        {
            if(heights[j] != expected[j]){
                
                count++;
            } 
            j++;
        }

        return count;
        
    }
}