// Last updated: 21/04/2026, 00:02:16
1class Solution {
2    public int earliestFullBloom(int[] plantTime, int[] growTime) {
3        int n=plantTime.length;
4        int[][] arr= new int[n][2];
5        for(int i=0;i<n;i++){
6            arr[i][0]=plantTime[i];
7            arr[i][1]=growTime[i];
8        }
9        Arrays.sort(arr, (a,b) -> Integer.compare(b[1],a[1]));
10         int res=0;
11         int curr=0;
12        for(int[] num:arr){
13            curr+=num[0];
14            res=Math.max(res,curr+num[1]);
15        }
16        return res;
17    }
18}