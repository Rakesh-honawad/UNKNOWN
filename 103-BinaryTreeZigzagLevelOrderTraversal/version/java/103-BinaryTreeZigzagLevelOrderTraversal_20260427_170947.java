// Last updated: 27/04/2026, 17:09:47
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
17    public TreeNode removeLeafNodes(TreeNode root, int target) {
18        if(root==null)return null;
19        root.left=removeLeafNodes(root.left,target);
20        root.right=removeLeafNodes(root.right,target);
21        if(root.left==null && root.right==null && root.val==target)return null;
22        return root;
23        
24    }
25}