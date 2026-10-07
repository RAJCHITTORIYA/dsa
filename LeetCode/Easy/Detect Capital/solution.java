
class Solution {
    public boolean detectCapitalUse(String word) {

        int upper = 0;

        // Count uppercase letters
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            }
        }

        // Case 1: All uppercase
        if (upper == word.length()) {
            return true;
        }

        // Case 2: All lowercase
        if (upper == 0) {
            return true;
        }

        // Case 3: Only first letter uppercase
        if (upper == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}