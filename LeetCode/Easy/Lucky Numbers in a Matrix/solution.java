class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int value = matrix[i][j];

                boolean rowMin = true; // checked

                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < value) {
                        rowMin = false;
                        break;
                    }
                }

                boolean colMax = true;  //

                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > value) {
                        colMax = false;
                        break;
                    }
                }

                if (rowMin && colMax) {
                    ans.add(value);
                }
            }
        }

        return ans;        
    }
}