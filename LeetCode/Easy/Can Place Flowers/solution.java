class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int k) {
        int n = flowerbed.length;

        if(k == 0 ) return true;

        int i = 0 ;
       

        for(i = 0 ; i<n ; i++)
        {
            if(flowerbed[i] == 0)
            {
                boolean rightKhali = (  (i == n-1) || (flowerbed[i+1] == 0));
                
                boolean leftKhali = ( (i == 0) || (flowerbed[i-1] == 0) ); 

                if(rightKhali && leftKhali)
                {
                    flowerbed[i] = 1;
                    k--;

                    if(k == 0) return true;
                }

            }
        }
        return false;      
        
    }
}