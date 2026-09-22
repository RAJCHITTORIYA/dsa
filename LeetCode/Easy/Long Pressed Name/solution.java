class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int n = name.length();
        int m = typed.length();

        int i = 0;
        int j = 0;

        while(i < n && j<m)
        {
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                j++;  
            } 
            else
            {
                return false;
            }     
        }
        
        if(i == n) {
    while(j < m) {
        if(typed.charAt(j) != typed.charAt(j - 1)) {
            return false;
        }
        j++;
    }
    return true;
}

return false;

        
    }
}