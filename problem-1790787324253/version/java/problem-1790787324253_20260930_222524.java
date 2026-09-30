// Last updated: 30/09/2026, 22:25:24
1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3         int[] res=new int[2];
4        HashMap<Integer,Integer>mp= new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
7        }
8        int idx=0;
9        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
10            if(e.getValue()==2){
11                res[idx++]=e.getKey();
12            }
13        }
14        return res;
15        
16    }
17}