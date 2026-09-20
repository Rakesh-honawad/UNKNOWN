// Last updated: 20/09/2026, 11:05:24
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>st= new Stack<>();
4        for(char c:s.toCharArray()){
5            if(c=='['||c=='{'||c=='('){
6                st.push(c);
7            }else{
8                if(st.isEmpty())return false;
9                char top=st.pop();
10                if(c==']'&&top!='[')return false;
11                if(c=='}'&&top!='{')return false;
12                if(c==')'&&top!='(')return false;
13
14            }
15        }
16        return st.isEmpty();
17        
18    }
19}