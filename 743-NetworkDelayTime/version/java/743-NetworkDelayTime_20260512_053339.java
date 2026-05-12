// Last updated: 12/05/2026, 05:33:39
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        List<List<int[]>>gp = new ArrayList<>();
4        for(int i=0;i<=n;i++){
5            gp.add(new ArrayList<>());
6        }
7        for(int[] t:times){
8            int u=t[0];
9            int v=t[1];
10            int w=t[2];
11
12            gp.get(u).add(new int[]{v,w});
13        }
14        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
15
16        int[] dist=new int[n+1];
17        Arrays.fill(dist,Integer.MAX_VALUE);
18        dist[k]=0;
19        pq.offer(new int[]{k,0});
20
21        while(!pq.isEmpty()){
22            int[] curr= pq.poll();
23            int node=curr[0];
24            int time=curr[1];
25            if(time > dist[node])continue;
26
27            for(int[] nie:gp.get(node)){
28                int next=nie[0];
29                int weight=nie[1];
30
31                if(dist[next]>time+weight){
32                    dist[next]=time+weight;
33                    pq.offer(new int[]{next,dist[next]});
34                }
35            }
36        }
37        int ans=0;
38        for(int i=1;i<=n;i++){
39            if(dist[i]==Integer.MAX_VALUE){
40                return -1;
41            }
42            ans=Math.max(ans,dist[i]);
43        }
44        return ans;
45    }
46}