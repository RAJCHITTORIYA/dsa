class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();

        Stack <Character> stack = new Stack<>();


        for(int i = 0 ; i< n ; i++)
        {
            char current = s.charAt(i);

            if(!stack.isEmpty() && stack.peek() == current)
            {
                stack.pop();
            }
            else
            {
                stack.push(current);
            }   
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack)
        {
            sb.append(c);
        }
        return sb.toString();
                
    }
}