// Last updated: 01/06/2026, 11:29:09
1class Solution {
2    public int minimumCost(int[] cost) {
3         Arrays.sort(cost);
4        reverseArray(cost);
5        int n=cost.length;
6        int sum=0;
7       if(n==1)return cost[0];
8        for(int i=0;i<n;i++){
9            sum+=cost[i];
10        }
11        for(int i=2;i<n;i+=3){
12            sum-=cost[i];
13        }
14        return sum; 
15    }
16    private static void reverseArray(int[] array) {
17        int left = 0;
18        int right = array.length - 1;
19        
20        while (left < right) {
21            // Swap elements at left and right
22            int temp = array[left];
23            array[left] = array[right];
24            array[right] = temp;
25            left++;
26            right--;
27        }
28    }
29}