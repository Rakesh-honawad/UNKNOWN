// Last updated: 21/04/2026, 21:25:00
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        int i=0;
4        int j=people.length-1;
5        int count=0;
6        Arrays.sort(people);
7        while(i<=j){
8            if(people[i]+people[j]<=limit){
9                i++;
10            }
11            j--;
12            count++;
13
14
15        }
16        return count;
17    }
18}