// Last updated: 06/05/2026, 19:21:24
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    public Node cloneGraph(Node node) {
23        if(node==null)return null;
24        Map<Node,Node>mp=new HashMap<>();
25        Queue<Node>q=new LinkedList<>();
26        q.offer(node);
27        mp.put(node,new Node(node.val));
28        while(!q.isEmpty()){
29           Node cur=q.poll();
30           for(Node ni:cur.neighbors){
31              if(!mp.containsKey(ni)){
32                mp.put(ni,new Node(ni.val));
33                q.offer(ni);
34              }
35              mp.get(cur).neighbors.add(mp.get(ni));
36           }
37        }
38      return mp.get(node);       
39        
40    }
41}