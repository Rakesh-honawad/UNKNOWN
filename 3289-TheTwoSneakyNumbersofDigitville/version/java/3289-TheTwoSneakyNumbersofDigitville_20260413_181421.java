// Last updated: 13/04/2026, 18:14:21
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
14
15 * }
16 */
17class Solution {
18    public boolean checkTree(TreeNode root) {
19        int left=root.left.val;  
20        int right=root.right.val;
21         
22        return root.val==(left+right);
23    }
24}