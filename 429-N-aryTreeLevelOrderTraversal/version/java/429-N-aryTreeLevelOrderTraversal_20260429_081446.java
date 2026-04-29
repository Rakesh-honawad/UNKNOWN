// Last updated: 29/04/2026, 08:14:46
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> largestValues(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        ArrayList<Integer>res= new ArrayList<>();
20        if(root==null)return res;
21        q.offer(root);
22        while(!q.isEmpty()){
23            List<Integer>lst=new ArrayList<>();
24            int n=q.size();
25            int mx=Integer.MIN_VALUE;
26            for(int i=0;i<n;i++){
27                TreeNode curr=q.poll();
28                mx=Math.max(mx,curr.val);
29                if(curr.left!=null) q.add(curr.left);
30                if(curr.right!=null)q.add(curr.right);   
31            }
32            res.add(mx);
33        }
34        return res;
35    }
36}