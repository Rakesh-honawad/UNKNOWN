// Last updated: 02/03/2026, 17:21:42
// Esasy solution
1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int count=0;
4        for(int num:hours){
5            if(num>=target) count++;
6        }
7        return count;
8        
9    }
10}