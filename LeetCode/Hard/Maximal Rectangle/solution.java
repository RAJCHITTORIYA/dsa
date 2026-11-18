// class Solution {

//      public char largestRectangleArea(int[] arr) {

//            int n = arr.length;
//            int[] nse = new int[n];
//            nse[n-1] = n;

//            Stack<Integer> st = new Stack<>();
//            st.push(n-1);
//            for(int i = n-2 ; i>=0 ; i--)
//            {
//                while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
//                if(st.size() == 0) nse[i] = n ;
//                else nse[i] = st.peek();
//                st.push(i);
//            }

//            while(st.size() > 0) st.pop();

//            int[] pse = new int[n];
//            pse[0] = -1;
//            st.push(0);

//            for(int i = 1 ; i<n; i++)
//            {
//                while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();

//                if(st.size() == 0) pse[i] = -1;
//                else pse[i] = st.peek();
//                st.push(i);
//            }

//            int maxArea = 0;
//            for(int i = 0 ; i<n ; i++)
//            {
//                char area = arr[i] * (nse[i]-pse[i]-1);
//                maxArea = Math.max(maxArea , area);
//            }
//            return maxArea;        
//        }



    
    


//     public int maximalRectangle(char[][] mat) {


//         int n = mat.length ;
//         int m = mat[0].length;
        
//         for(int i = 1 ; i<n ; i++)
//         {
//             for(int j = 0 ; j<m ; j++)
//             {
//                 if(mat[i][j] == 1) mat[i][j] += mat[i-1][j];   
//             }
//         }
//         int max = 0;
//         for(char[] row : mat){
//             char area = largestRectangleArea(row);
//             max = Math.max(max,area);
//         }
//         return max; 
        
//     }
// }




import java.util.*;

class Solution {

    public int largestRectangleArea(int[] arr) {

        int n = arr.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element
        for(int i = n-1; i >= 0; i--) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        st.clear();

        // Previous Smaller Element
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < n; i++) {

            int area = arr[i] * (nse[i] - pse[i] - 1);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }


    public int maximalRectangle(char[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[] heights = new int[m];

        int max = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(mat[i][j] == '1') {
                    heights[j]++;
                }
                else {
                    heights[j] = 0;
                }
            }

            int area = largestRectangleArea(heights);

            max = Math.max(max, area);
        }

        return max;
    }
}
