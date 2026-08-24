/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) ->
    Integer.compare(a.start, b.start)
);
        for(int i=1;i<intervals.size();i++)
        {
            int prvend =intervals.get(i-1).end;
            int currst = intervals.get(i).start;
            if(currst < prvend)
            {
                return false;
            }
        }
        return true;
    }
}
