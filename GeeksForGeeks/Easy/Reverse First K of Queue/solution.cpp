class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        int n = q.size();
        if(k > n || n == 0 )return q;
        
        Stack<Integer> st = new Stack<>();
        for(int i = 1 ; i<= k ; i++)
        {
            st.push(q.remove());
            
        }
        while(st.size() > 0)
        {
            q.add(st.pop());
        }
        for(int i = 1 ; i<= q.size()-k;i++)
        {
            q.add(q.remove());
        }
        return q;
        
    }
}