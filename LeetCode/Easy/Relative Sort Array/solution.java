class Solution {
    public int[] relativeSortArray(int[] arr, int[] arr2) {
        int n = arr.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n];

        Arrays.sort(arr);
        boolean[] visited = new boolean[n];

        int k = 0;

        for(int j = 0 ; j<n2 ; j++)
        {
            for(int i = 0 ; i< n ; i++)
            {
                 if(arr[i] == arr2[j] && !visited[i]) {

                    arr3[k++] = arr[i];
                    visited[i] = true;
                }
            }
        }

        for(int i = 0; i < n; i++) {

            if(!visited[i]) {
                arr3[k++] = arr[i];
            }
        }

        return arr3;        
    }
}
