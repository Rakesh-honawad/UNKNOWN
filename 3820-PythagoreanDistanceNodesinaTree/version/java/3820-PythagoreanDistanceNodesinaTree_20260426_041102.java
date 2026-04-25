// Last updated: 26/04/2026, 04:11:02
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
17    public List<Double> averageOfLevels(TreeNode root) {
18        List<Double>res= new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        if(root==null) return res;
21        q.add(root);
22        while(!q.isEmpty()){
23            int n=q.size();
24            double sum=0.0;
25            for(int i=0;i<n;i++){
26                TreeNode node=q.poll();
27                sum+=node.val;
28                if(node.left!=null)q.offer(node.left);
29                if(node.right!=null)q.offer(node.right);
30                
31            }
32            res.add(sum/n);
33           
34        }
35         return res;
36        
37    }
38}