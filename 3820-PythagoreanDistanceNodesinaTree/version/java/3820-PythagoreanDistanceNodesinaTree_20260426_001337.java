// Last updated: 26/04/2026, 00:13:37
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
17    public TreeNode sortedArrayToBST(int[] nums) {
18        return bst(nums,0,nums.length-1);    
19    }
20    public static TreeNode bst(int[] nums,int left,int right){
21        if(left > right)return null;
22        int mid=(left+right)/2;
23        TreeNode node=new TreeNode(nums[mid]);
24        node.left=bst(nums,left,mid-1);
25        node.right=bst(nums,mid+1,right);
26        return node;
27    }
28}