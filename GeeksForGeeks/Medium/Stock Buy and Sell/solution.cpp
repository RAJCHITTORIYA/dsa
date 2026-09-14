// class Solution {
//     int stockBuySell(int prices[]) {
//         int n = prices.length;
//         int maxProfit = 0;
//         int i = 0 , j = i+1;
//         while(j < n)
//         {
//             if(prices[i] < prices[j])
//             {
//                 int profit = prices[j] - prices[i];
//                 maxProfit = Math.max(maxProfit , profit);
//             }
//             else
//             {
//                 i = j ;
//             }
//             j++;
//         }
        
//         return maxProfit;
//     }
// }


class Solution {
    int stockBuySell(int prices[]) {
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}