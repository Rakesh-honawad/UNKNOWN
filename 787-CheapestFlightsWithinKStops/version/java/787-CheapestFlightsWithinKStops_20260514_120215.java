// Last updated: 14/05/2026, 12:02:15
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        int[] dist= new int[n];
4        Arrays.fill(dist, Integer.MAX_VALUE);
5        dist[src]=0;
6        List<List<int[]>>grp=new ArrayList<>();
7
8        for(int i=0;i<n;i++){
9            grp.add(new ArrayList<>());
10        }
11        for(int[] f:flights){
12            int u=f[0];
13            int v=f[1];
14            int w=f[2];
15            grp.get(u).add(new int[]{v,w});
16        }
17        
18        Queue<int[]> q= new LinkedList<>();
19        q.add(new int[]{src,0,0});
20        while(!q.isEmpty()){
21            int[]curr=q.poll();
22            int node=curr[0];
23            int dis=curr[1];
24            int stops=curr[2];
25            if(stops>k)continue;
26            for(int[] nie:grp.get(node)){
27                int next=nie[0];
28                int weight=nie[1];
29                int cost=dis+weight;
30                if(cost< dist[next]){
31                    dist[next]=cost;
32                    q.add(new int[]{next, cost, stops+1});
33                }
34            }
35        }
36        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];        
37    }
38}