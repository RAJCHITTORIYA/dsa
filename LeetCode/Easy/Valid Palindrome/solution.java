class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // Skip non-alphanumeric from left
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            // Skip non-alphanumeric from right
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            // Compare after converting to lowercase
            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}