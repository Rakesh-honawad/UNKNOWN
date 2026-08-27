// Last updated: 27/08/2026, 17:51:02
1class Solution {
2    public int[] corpFlightBookings(int[][] bookings, int n) {
3        int[] diff= new int[n+2];
4        for(int i=0;i<bookings.length;i++){
5            int first=bookings[i][0];
6            int last=bookings[i][1];
7            int seat=bookings[i][2];
8            diff[first]+=seat;
9           
10            diff[last+1]-=seat;
11
12        }
13        int[] ans = new int[n];
14        int curr=0;
15        for (int i = 1; i <= n; i++) {
16            curr +=diff[i];
17            ans[i-1]=curr;
18        }
19        return ans;
20
21    }
22}