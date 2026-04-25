// Last updated: 26/04/2026, 04:44:08
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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18
19        if (subRoot == null) return true;
20        if (root == null) return false;
21
22        if (isSub(root, subRoot)) return true;
23
24        return isSubtree(root.left, subRoot) || 
25               isSubtree(root.right, subRoot);
26    }
27
28    private boolean isSub(TreeNode root, TreeNode subRoot) {
29        if (root == null && subRoot == null) return true;
30        if (root == null || subRoot == null) return false;
31        if (root.val != subRoot.val) return false;
32
33        return isSub(root.left, subRoot.left) &&
34               isSub(root.right, subRoot.right);
35    }
36}