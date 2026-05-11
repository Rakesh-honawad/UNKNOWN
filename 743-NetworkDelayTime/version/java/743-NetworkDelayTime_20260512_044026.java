// Last updated: 12/05/2026, 04:40:26
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3        //build graph
4        List<List<int[]>> gp= new ArrayList<>();
5        for(int i=0;i<=n;i++){
6            gp.add(new ArrayList<>());
7        }
8        for(int[] t:times){
9            int u=t[0];
10            int v=t[1];
11            int w=t[2];
12            gp.get(u).add(new int[]{v,w});
13        }
14        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->(a[1]-b[1]));
15
16        //intiallize
17        int[] dist=new int[n+1];
18        Arrays.fill(dist,Integer.MAX_VALUE);
19
20        dist[k]=0;
21        pq.offer(new int[]{k,0}); 
22
23        while(!pq.isEmpty()){
24            int[] curr= pq.poll();
25            int node=curr[0];
26            int time=curr[1];
27
28            if(time > dist[node]) continue;
29
30            for(int[] neighbor:gp.get(node)){
31                int next=neighbor[0];
32                int weight=neighbor[1];
33
34                if(dist[next]>time+weight){
35                    dist[next]=time+weight;
36                    pq.offer(new int[]{next,dist[next]});
37                }
38            }   
39        }
40        int  resss=0;
41            for(int i=1;i<=n;i++){
42                if(dist[i]==Integer.MAX_VALUE)return -1;
43                resss=Math.max(resss,dist[i]);
44            }  
45        return resss;
46    }
47}