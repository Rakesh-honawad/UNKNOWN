// Last updated: 26/04/2026, 03:47:15
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
18        List<Double>res=new ArrayList<>();
19        Queue<TreeNode> q=new LinkedList<>();
20        
21        if(root==null) return res;
22        q.add(root);
23        while(!q.isEmpty()){
24            double sum=0.0;
25            int n=q.size();
26
27            for(int i=0;i<n;i++){
28                TreeNode node=q.poll();
29                sum+=node.val;
30                if(node.left!=null)q.offer(node.left);
31                if(node.right!=null)q.offer(node.right);
32            }
33            res.add(sum/n);
34            
35        }
36        return res;
37        
38    }
39}