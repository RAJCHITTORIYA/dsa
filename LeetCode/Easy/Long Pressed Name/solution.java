class Solution {
    public boolean isLongPressedName(String name, String typed) {

           int i = 0; // name pointer
        int j = 0; // typed pointer

        while (j < typed.length()) {

            // Normal character match
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }

            // Long pressed character
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }

            // Invalid character
            else {
                return false;
            }
        }

        // Name ke saare characters consume hone chahiye
        return i == name.length();

    


        
    }
}