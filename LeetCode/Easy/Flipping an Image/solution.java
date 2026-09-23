class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        // int n = image.length;
        // int m = image[0].length;

        // for(int i = 0 ; i < n; i++)
        // {
        //     int temp = image[i][0];
        //     image[i][0] = image[i][n-1];
        //     image[i][n-1] = temp; 

        //     for(int j = 0 ; j< m ; j++)
        //     {

        //     int temp2 = image[0][j];
        //     image[0][j] = image[n-1][j];
        //     image[n-1][j] = temp2;


        //         if(image[i][j] == 1)
        //         {
        //             image[i][j] = 0;
        //         }else
        //         {
        //             image[i][j] = 1;
        //         }
                
        //     }
        // }
        // return image;

        int n = image.length;

        for (int i = 0; i < n; i++) {

            // Reverse the row
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {

                // Swap + invert
                int temp = image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = 1 - temp;

                left++;
                right--;
            }
        }

        return image;        
    }
}