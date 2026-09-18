// Last updated: 18/09/2026, 23:53:24
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> st= new HashSet<>();
4         int i=0;int j=0;int max=0;
5         while(j<s.length()){
6            if(!st.contains(s.charAt(j))){
7                st.add(s.charAt(j));
8                max=Math.max(max,j-i+1);
9                j++;
10            }else{
11                st.remove(s.charAt(i));
12                i++;
13
14            }
15         }
16         return max;
17        
18    }
19}