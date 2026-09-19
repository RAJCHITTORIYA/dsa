class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Step 1: arr1 ko sort karo
        Arrays.sort(arr1);

        int[] result = new int[arr1.length];
        boolean[] visited = new boolean[arr1.length];

        int index = 0;

        // Step 2: arr2 ke according elements nikalo
        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr1.length; j++) {

                if (!visited[j] && arr1[j] == arr2[i]) {

                    result[index] = arr1[j];
                    index++;

                    visited[j] = true;
                }
            }
        }

        // Step 3: jo elements arr2 mein nahi hain
        // unko ascending order mein add karo
        for (int i = 0; i < arr1.length; i++) {

            if (!visited[i]) {
                result[index] = arr1[i];
                index++;
            }
        }

        return result;
               
        
    }
}






