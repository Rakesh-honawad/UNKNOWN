// Last updated: 14/05/2026, 10:30:04
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        int[] dist= new int[n];
4        Arrays.fill(dist, Integer.MAX_VALUE);
5        dist[src]=0;
6        List<List<int[]>>grp=new ArrayList<>();
7
8
9        for(int i=0;i<n;i++){
10            grp.add(new ArrayList<>());
11        }
12        for(int[] f:flights){
13            int u=f[0];
14            int v=f[1];
15            int w=f[2];
16
17            grp.get(u).add(new int[]{v,w});
18        }
19        Queue<int[]> q= new LinkedList<>();
20        q.add(new int[]{src,0,0});
21        while(!q.isEmpty()){
22            int[]curr=q.poll();
23            int node=curr[0];
24            int dis=curr[1];
25            int stops=curr[2];
26            if(stops>k)continue;
27            for(int[] nie:grp.get(node)){
28                int next=nie[0];
29                int weight=nie[1];
30                int cost=dis+weight;
31                if(cost< dist[next]){
32                    dist[next]=cost;
33                    q.add(new int[]{next, cost, stops+1});
34                }
35            }
36        }
37        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];        
38    }
39}