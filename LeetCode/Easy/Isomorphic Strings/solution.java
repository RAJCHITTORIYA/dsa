class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] mapST = new int[128];
        int[] mapTS = new int[128];

        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i);
            int b = t.charAt(i);

            // s -> t mapping check
            if (mapST[a] != 0 && mapST[a] != b) {
                return false;
            }

            // t -> s mapping check
            if (mapTS[b] != 0 && mapTS[b] != a) {
                return false;
            }

            mapST[a] = b;
            mapTS[b] = a;
        }

        return true;
    }
}