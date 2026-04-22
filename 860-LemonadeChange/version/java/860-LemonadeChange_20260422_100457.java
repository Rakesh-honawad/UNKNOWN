// Last updated: 22/04/2026, 10:04:57
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five=0;
4        int ten=0;
5        for(int i=0;i<bills.length;i++){
6            if(bills[i]==5) five++;
7            else if(bills[i]==10){
8                five--;
9                ten++;
10            }
11          
12           else{
13               if(ten>0){
14                ten--;
15                five--;
16               }
17               else{
18                   five-=3;
19               }
20           }  
21           if(five<0) return false;
22
23        }
24        return true;
25        
26    }
27}