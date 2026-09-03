// Last updated: 03/09/2026, 22:44:26
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5        int[][] dp= new int[n+1][m+1];
6        for(int[] d:dp){
7            Arrays.fill(d,-1);
8        }
9         return helper(0,0,word1,word2,dp);
10        // return (word1.length()-lcs)+word2.length()-lcs;
11    }
12    int helper(int i,int j, String s1, String s2,int[][]dp){
13        if(i==s1.length())return s2.length()-j;
14        if(j==s2.length())return s1.length()-i;
15        if(dp[i][j]!=-1)return dp[i][j];
16        if(s1.charAt(i)==s2.charAt(j)){
17            return dp[i][j]=helper(i+1,j+1,s1,s2,dp);
18        }
19        int insert=1+helper(i,j+1,s1,s2,dp);
20        int delete=1+helper(i+1,j,s1,s2,dp);
21        int replace=1+helper(i+1,j+1,s1,s2,dp);
22
23        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
24    }
25}