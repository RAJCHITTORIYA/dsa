class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i <s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(st.size() == 0)
            st.push(ch);
            else
            {
                if(ch != st.peek())
                st.push(ch);
            }
            
        }
        
        
        StringBuilder sb = new StringBuilder();

        for (char ch : st) {
            sb.append(ch);
        }

        String ans = sb.toString();
        return ans;
        
    }
}