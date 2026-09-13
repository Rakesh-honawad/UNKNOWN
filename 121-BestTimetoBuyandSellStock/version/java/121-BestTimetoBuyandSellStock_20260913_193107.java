// Last updated: 13/09/2026, 19:31:07
1class Solution {
2    public String reverseWords(String s) {
3        String[] res= s.trim().split("\\s+");
4        StringBuilder ans= new StringBuilder();
5        for(int i=res.length-1;i>=0;i--){
6            ans.append(res[i]);
7            if(i!=0)ans.append(" ");
8        }
9        return ans.toString();
10         
11        
12    }
13}