class Solution {
    public String reverseWords(String s) {

        char[] ch = s.toCharArray();
        int n = s.length();
        int start = 0;
    
        for(int i = 0; i<=n; i++)
        {
            if(i == n || ch[i] == ' ')
            {
                int left = start;
                int right = i - 1;

                while(left < right)
                {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }
                start = i + 1;
            }
        }
        String k = new String(ch);
        return k; 
    }
}
