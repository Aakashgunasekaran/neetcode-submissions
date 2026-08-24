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
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }

        // Sort intervals by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        // Min-heap tracks end times of active meetings
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the end time of the first meeting
        minHeap.offer(intervals.get(0).end);

        for (int i = 1; i < intervals.size(); i++) {
            Interval current = intervals.get(i);

            // If room is free before/at current meeting start time, reuse it
            if (current.start >= minHeap.peek()) {
                minHeap.poll();
            }

            // Allocate room (or update existing room's end time)
            minHeap.offer(current.end);
        }

        return minHeap.size();
    }
}