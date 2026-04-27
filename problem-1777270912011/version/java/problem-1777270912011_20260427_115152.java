// Last updated: 27/04/2026, 11:51:52
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18       
19       Queue<TreeNode > q=new LinkedList<>();
20       List<List<Integer>> res=new LinkedList<>();
21       if(root==null)return res;
22       q.offer(root);
23       while(!q.isEmpty()){
24           int n=q.size();
25           List<Integer> lst=new LinkedList<>();
26           for(int i=0;i<n;i++){
27              if(q.peek().left!=null)q.offer(q.peek().left);
28              if(q.peek().right!=null)q.offer(q.peek().right);
29              lst.add(q.poll().val);
30            }
31            if(root==null)return res;
32            res.add(lst);
33       }
34       return res;
35        
36    }
37}