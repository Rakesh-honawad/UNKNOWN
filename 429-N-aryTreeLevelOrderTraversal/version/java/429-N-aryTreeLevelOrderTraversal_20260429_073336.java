// Last updated: 29/04/2026, 07:33:36
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
21    public List<List<Integer>> levelOrder(Node root) {
22        List<List<Integer>>res= new ArrayList<>();
23        if(root==null)return res;
24        Queue<Node> q= new LinkedList<>();
25        q.add(root);
26        while(!q.isEmpty()){
27            List<Integer>lst= new ArrayList<>();
28            int n=q.size();
29            for(int i=0;i<n;i++){
30                Node curr= q.remove();
31                lst.add(curr.val);
32                for(Node child:curr.children){
33                     q.add(child);
34                }
35            
36           }
37           res.add(lst);
38        }
39        return res;
40
41
42        
43    }
44}