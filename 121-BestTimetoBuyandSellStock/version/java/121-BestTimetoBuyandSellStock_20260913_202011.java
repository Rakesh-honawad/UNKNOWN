// Last updated: 13/09/2026, 20:20:11
1class Solution {
2    public int lengthOfLastWord(String s) {
3        // String[] st=s.trim().split("\\s+");
4        // String res=st[st.length-1];
5        // return res.length();  
6        int len=0;    
7        for(int i=s.length()-1;i>=0;i--) {
8            if(s.charAt(i) != ' '){
9                len++;
10            }else if(len>0)break;
11        }
12        return len;
13    }
14}