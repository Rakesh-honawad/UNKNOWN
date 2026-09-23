// Last updated: 23/09/2026, 23:48:18
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character>st= new Stack<>();
4        for(char c:s.toCharArray()){
5            if(c=='{'||c=='['||c=='('){
6                st.push(c);
7            }else{
8                if(st.isEmpty()){
9                    return false;
10                }
11                char top=st.pop();
12                if(c==']'&& top!='[')return false;
13                if(c=='}'&& top!='{')return false;
14                if(c==')'&& top!='(')return false;
15            }
16        }
17        return st.isEmpty();
18    }
19}