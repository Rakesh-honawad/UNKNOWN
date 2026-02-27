// Last updated: 27/02/2026, 14:28:38
// priority queue
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>();
4        for(int num:nums){
5            pq.offer(num);
6            if(pq.size()>k){
7                pq.poll();
8            }
9        }
10        
11        return pq.peek();
12        
13    }
14}