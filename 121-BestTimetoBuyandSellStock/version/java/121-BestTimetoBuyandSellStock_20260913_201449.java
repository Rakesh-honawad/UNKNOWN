// Last updated: 13/09/2026, 20:14:49
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String[] st=s.trim().split("\\s+");
4        String res=st[st.length-1];
5        return res.length();       
6    }
7}