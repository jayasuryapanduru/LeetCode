class Solution {
    public int maxTwoEvents(int[][] events) {
         Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int numOfEvents = events.length;
      
        // 'maxValueAfter' array will store the maximum value from current event to the last event
        int[] maxValueAfter = new int[numOfEvents + 1];
        for (int i = numOfEvents - 1; i >= 0; --i) {
            maxValueAfter[i] = Math.max(maxValueAfter[i + 1], events[i][2]);
        }

        int maxTotalValue = 0;
      
        for (int[] event : events) {
            int value = event[2]; // Value of the current event
          
            // Binary search to find the first event that starts after the current event ends
            int left = 0, right = numOfEvents;
            while (left < right) {
                int mid = (left + right) >> 1;
                if (events[mid][0] > event[1]) {
                    // If the event at 'mid' starts after current event ends, search in left half
                    right = mid;
                } else {
                    // Otherwise search in the right half
                    left = mid + 1;
                }
            }
          
            // If there is an event that starts after the current one, add its value
            if (left < numOfEvents) {
                value += maxValueAfter[left];
            }
          
            // Update the maximum total value if needed
            maxTotalValue = Math.max(maxTotalValue, value);
        }
        return maxTotalValue;
    }
}