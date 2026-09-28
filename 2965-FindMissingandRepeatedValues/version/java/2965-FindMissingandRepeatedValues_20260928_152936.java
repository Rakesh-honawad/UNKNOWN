// Last updated: 28/09/2026, 15:29:36
1class Solution {
2    public List<Integer> findPeaks(int[] mountain) {
3        List<Integer>res= new ArrayList<>();
4       
5        for(int i=1;i<mountain.length-1;i++){
6            
7            if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1])res.add(i);
8
9        }
10        return res;
11        
12    }
13}