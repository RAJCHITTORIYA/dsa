class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // int n = mat.length;
        // int m = mat[0].length;
        // int countOne  = 0;
        // int countZero  = 0;

        // int[] weak = new int[n];

        // for(int i = 0 ; i < n ; i++)
        // {
        //     for(int j = 0 ; j<m ; j++)
        //     {
        //         // row -1 
        //         if(mat[i] ==  1) countOne ++;
        //         if(mat[j] == 0) countZero ++;

        //     }
        // }

        int m = mat.length;
        int n = mat[0].length;

        int[][] arr = new int[m][2];

        for(int i = 0; i < m; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1) {
                    count++;
                }
            }

            arr[i][0] = count;
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        int[] ans = new int[k];

        for(int i = 0; i < k; i++) {
            ans[i] = arr[i][1];
        }

        return ans;
    }
}

