class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String op : tokens)
        {
            if(op.equals("+"))
            {
                int first = st.pop();
                int second  = st.pop();
                st.push(first+second);

            }
             else if(op.equals("-"))
            {
                 int first = st.pop();
                int second  = st.pop();
                st.push(second - first);
            }
            else if(op.equals("*"))
            {
                 int first = st.pop();
                int second  = st.pop();
                st.push(first*second);
            }
             else if(op.equals("/"))
            {
                 int first = st.pop();
                int second  = st.pop();
                st.push(second/first);
            }
            else 
            {
                st.push(Integer.parseInt(op));
            }
        }
        return st.peek();
        
    }
}