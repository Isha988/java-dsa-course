/*
 * Activity Selection
    You are given n activities with their start and end times. 
    Select the maximum number of activities that can be performed by a single person, 
    assuming that a person can only work on a single activity at a time.
    Activities are sorted according to end time.
    Example: 
    start = [10, 12, 20]
    end = [20, 25, 30]
    ans = 2 (A0 & A2)
 */
package T25Greedy;

public class L1ActivitySelection {
    public static void main(String[] args) {
        // int[][] activities = { { 10, 20 }, { 12, 25 }, { 20, 30 } };
        int[][] activities = {{1,2}, {3,4}, {0,6}, {5,7}, {8,9}, {5,9}};
        System.out.println(activitySelection(activities));
    }

    /*
     * activity[0] start time
     * activity[1] end time
     */
    // O(n)
    static int activitySelection(int[][] activity) {
        int count = 0;
        // sort activities based on end time
        // Already sorted given in ques, no need to sort

        // select 1st activity
        count = 1;
        int lastSelected = 0;

        // loop through each activity to select it as next activity if possible
        for (int i = 1; i < activity.length; i++) {
            // checking non overlapping
            // start of activity >= end time of last selected activity
            if (activity[i][0] >= activity[lastSelected][1]) {
                lastSelected = i;
                count++;
            }
        }

        return count;
    }
}