class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n  = arr.length;

        // for(int i = 1 ; i<n-1 ; i++)
        // {
        //     if(arr[i] > arr[i-1] && arr[i] > arr[i+1])return i;
        // }
        // return -1;
        // while(i < j)
        // {
        //     if(arr[i] < arr[i+1])
        //     {
        //         i++;
        //     }
        // }
        int i = 0 , j = n -1;
        while(i < j)
        {
            int mid = (i + j)/2 ;
            if(arr[mid] < arr[mid +1]) i = mid + 1;
            else  j = mid ;

        }
        return i;
        
    }
}