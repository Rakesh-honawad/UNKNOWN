// Last updated: 27/04/2026, 06:17:38
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public int maxDepth(Node root) {
22        int mx=0;
23        if(root==null)return 0;
24        if(root!=null){
25            for(Node child:root.children){
26                mx=Math.max(mx,maxDepth(child));
27            }
28        }
29        return mx+1;
30        
31        
32    }
33}