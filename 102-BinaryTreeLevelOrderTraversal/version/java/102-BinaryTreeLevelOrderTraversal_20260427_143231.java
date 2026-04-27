// Last updated: 27/04/2026, 14:32:31
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
17    public int kthSmallest(TreeNode root, int k) {
18        List<Integer>lst=new ArrayList<>();
19        func(root,lst);
20        return lst.get(k-1);
21    }
22    private void func(TreeNode root, List<Integer> lst){
23        if(root==null)return;
24        func(root.left,lst);
25        lst.add(root.val);
26        func(root.right,lst);
27
28    }
29}