// Last updated: 22/04/2026, 10:38:55
1class Solution {
2    public int countOperations(int num1, int num2) {
3        int count=0;
4        if(num2==0 ||num1==0) return 0;
5        while(num1!=num2){
6            if(num1>=num2){
7                num1-=num2;
8                count++;
9            }
10            else{
11                num2-=num1;
12                count++;
13            }
14        }
15        return count+1;   
16    }
17}