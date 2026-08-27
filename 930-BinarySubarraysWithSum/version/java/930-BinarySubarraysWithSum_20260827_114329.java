// Last updated: 27/08/2026, 11:43:29
1class Solution {
2    public int findTheLongestSubstring(String s) {
3        HashMap<Integer,Integer> mp=new HashMap<>();
4        mp.put(0,-1);
5        int musk=0;
6        int count=0;
7        for(int i=0;i<s.length();i++){
8            char c=s.charAt(i);
9            if(c=='a'){
10                musk^=(1<<0);
11            }
12            else if(c=='e'){
13                musk^=(1<<1);
14            }
15             else if(c=='i'){
16                musk^=(1<<2);
17            } else if(c=='o'){
18                musk^=(1<<3);
19            } else if(c=='u'){
20                musk^=(1<<4);
21            }
22            if(mp.containsKey(musk)){
23                count=Math.max(count,i-mp.get(musk));
24            }else{
25                mp.put(musk,i);
26            }
27
28        }
29            return count;
30
31        
32    }
33}