// Last updated: 04/09/2026, 22:44:19
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n=text1.length();
4        int m=text2.length();
5        int[][] dp= new int[n][m];
6        for(int[]d:dp){
7            Arrays.fill(d,-1);
8        }
9        return helper(0,0, text1,text2,dp);
10    }
11    int helper(int i,int j, String s1,String s2,int[][]dp){
12        if(i==s1.length()||j==s2.length())return 0;
13        if(dp[i][j]!=-1)return dp[i][j];
14        if(s1.charAt(i)==s2.charAt(j)){
15            return dp[i][j]=1+helper(i+1,j+1,s1,s2,dp);
16        }
17        return dp[i][j]=Math.max(helper(i+1,j,s1,s2,dp),helper(i,j+1,s1,s2,dp));
18
19    }
20}