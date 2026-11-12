
class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;
        int i = 0;

        // Step 1: Check strictly increasing sequence
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: Peak cannot be first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 3: Check strictly decreasing sequence
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: Must reach the last element
        return i == n - 1;
    }
}
