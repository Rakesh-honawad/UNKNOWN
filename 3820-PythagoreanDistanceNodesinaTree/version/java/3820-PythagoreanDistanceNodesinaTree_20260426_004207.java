// Last updated: 26/04/2026, 00:42:07
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
17    
18    public int sumOfLeftLeaves(TreeNode root) {
19        int sum=0;
20        if(root==null)return 0;
21        if(root.left!=null && root.left.left==null && root.left.right==null) sum+=root.left.val;
22        sum+= sumOfLeftLeaves(root.left);
23        sum+= sumOfLeftLeaves(root.right);
24
25        return sum;
26    }
27}