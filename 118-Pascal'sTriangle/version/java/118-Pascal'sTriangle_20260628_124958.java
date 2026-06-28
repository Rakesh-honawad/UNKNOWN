// Last updated: 28/06/2026, 12:49:58
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> pq= new PriorityQueue<>();
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[0].length;j++){
6                pq.add(matrix[i][j]);
7            }
8        }
9        for(int i=0;i<k-1;i++){
10            pq.poll();
11        }
12        return pq.peek();
13        
14    }
15}