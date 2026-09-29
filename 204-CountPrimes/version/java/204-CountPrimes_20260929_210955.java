// Last updated: 29/09/2026, 21:09:55
1class Solution {
2    public int countPrimes(int n) {
3        if(n<=2)return 0;
4        int count=0;
5        boolean[] prime=new boolean[n];
6        Arrays.fill(prime,true);
7        prime[0]=false;
8        prime[1]=false;
9        for(int i=2;i*i<n;i++){
10           if(prime[i]){
11                for( int j=i*i;j<n;j+=i){
12                    prime[j]=false;
13                }
14            }
15        }
16        for(boolean p :prime){
17            if(p)count++;
18        }
19        return count;
20    }
21}