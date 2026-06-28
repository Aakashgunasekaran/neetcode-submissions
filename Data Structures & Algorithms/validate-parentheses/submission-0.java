class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
            {
                if(st.isEmpty()) return false;
                if(st.pop()!=map.get(c))
                {
                    return false;
                }
            }
            else
            {
                st.push(c);
            }
        }
        return st.isEmpty();
        
    }
}
