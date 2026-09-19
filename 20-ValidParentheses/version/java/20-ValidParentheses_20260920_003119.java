// Last updated: 20/09/2026, 00:31:19
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>st= new Stack<>();
4        for(char ch:s.toCharArray()){
5            if(ch=='('||ch=='{'||ch=='['){
6                st.push(ch);
7            }else{
8                if(st.isEmpty())return false;
9                char top=st.pop();
10                if(ch==')'&& top!='(')return false;
11                if(ch==']'&& top!='[')return false;
12                if(ch=='}'&& top!='{')return false;
13            }
14        }
15        return st.isEmpty();
16        
17    }
18}