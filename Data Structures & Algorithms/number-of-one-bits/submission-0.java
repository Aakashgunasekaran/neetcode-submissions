class Solution {
    public int hammingWeight(int n) {
        String st = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
        
    }
}
