// Last updated: 28/09/2026, 12:21:02
1class Solution {
2    public int maxDepth(String s) {
3        int currdepth=0;
4        int maxdepth=0;
5        for(char c:s.toCharArray()){
6            if(c=='('){
7                currdepth++;
8                maxdepth=Math.max(maxdepth,currdepth);
9            }else if(c==')'){
10                currdepth--;
11            }
12        }
13        return maxdepth;        
14    }
15}