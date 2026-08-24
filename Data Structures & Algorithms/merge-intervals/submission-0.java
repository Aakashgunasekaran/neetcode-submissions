class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int [] curr = intervals[i];
            int [] prv = result.get(result.size()-1);
            if(curr[0]<=prv[1])
            {
                prv[1] = Math.max(prv[1],curr[1]);
            }
            else
            {
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
