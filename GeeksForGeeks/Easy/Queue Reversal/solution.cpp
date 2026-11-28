class Solution {
    public void reverseQueue(Queue<Integer> q) {
        int n = q.size();
            Stack<Integer> st = new Stack<>();
            for(int i =1 ; i<=n ; i++)
            {
                st.push(q.remove());
            }
            while(st.size() > 0)
            {
                q.add(st.pop());
            }
        
    }
}