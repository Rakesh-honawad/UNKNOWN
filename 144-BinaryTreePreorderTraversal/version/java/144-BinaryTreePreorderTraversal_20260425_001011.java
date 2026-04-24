// Last updated: 25/04/2026, 00:10:11
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> res= new ArrayList<>();
19        post(root,res);
20        return res;
21
22    }
23    private static void post(TreeNode root,List<Integer>res){
24        if(root!=null){
25            
26            post(root.left, res);
27            post(root.right,res);
28            res.add(root.val);
29        }
30    }
31}
32