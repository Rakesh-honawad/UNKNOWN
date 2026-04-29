// Last updated: 29/04/2026, 09:02:00
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
17    public int findSecondMinimumValue(TreeNode root) {
18        HashSet<Integer> res=new HashSet<>();
19        func(root,res);
20        if (res.size() < 2) return -1;
21        Integer[] values=res.toArray(new Integer[0]);
22        Arrays.sort(values);
23        return values[1];
24    }
25    private void func(TreeNode root,Set<Integer>res){
26        if(root==null)return;
27        func(root.left,res);
28        res.add(root.val);
29        func(root.right,res);
30    }
31}