class Solution {
    public int numSpecial(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        //int count = 0;

        // for(int i = 1 ; i<n ; i++)
        // {
        //     for(int j = 1 ; j<m ; j++)
        //     {
        //         if(mat[i][j] == 1 && mat[i][j-1] == 0 && mat[i-1][j] == 0)
        //         {
        //             count++;
        //         }
        //     }
        // }
        // return count; 

        int[] rs = new int[n];
        int[] cs = new int[m];

        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0; j<m ; j++)
            {

                if(mat[i][j] == 1){
                    rs[i]++;
                    cs[j]++;
                }
            }
        }
        int specialCount = 0;

        for(int i = 0 ; i<n ; i++)
        {
            for(int j = 0 ; j<m ; j++)

            {
                if(mat[i][j] == 1 && rs[i] == 1 && cs[j] == 1)
                {
                    specialCount++;
                }

            }
        }

        return specialCount++;

    }
}