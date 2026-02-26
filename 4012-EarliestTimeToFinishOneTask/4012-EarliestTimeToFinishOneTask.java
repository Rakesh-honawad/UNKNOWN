// Last updated: 26/02/2026, 14:03:28
class Solution {
    public int earliestTime(int[][] tasks) {
        int minimum=Integer.MAX_VALUE;
        for(int task[]:tasks){
            int finish=task[0]+task[1];
            minimum=Math.min(minimum,finish);
        }
        return minimum;
        
    }
}