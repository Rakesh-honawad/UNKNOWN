// Last updated: 22/04/2026, 10:06:31
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five=0;
4        int ten=0;
5        for(int i=0;i<bills.length;i++){
6            if(bills[i]==5){
7                five++;
8            }
9            else if(bills[i]==10){
10                
11                five--;
12                ten++;
13            }
14            else{
15                if(ten>0){
16                   ten--;
17                  five--;
18                }
19                else{
20                     five-=3;
21                }
22            }
23            
24            if(five<0)return false;
25        }
26        return true;
27    }
28}