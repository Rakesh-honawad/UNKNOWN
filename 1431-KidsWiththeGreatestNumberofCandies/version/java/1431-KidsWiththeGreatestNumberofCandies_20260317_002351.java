// Last updated: 17/03/2026, 00:23:51
// new code
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        List<Boolean> ls=new ArrayList<>();
4    
5        int max = Arrays.stream(candies).max().orElseThrow();
6
7        for (int num : candies) {
8            ls.add(num + extraCandies >= max); // Corrected condition
9        }
10
11       
12        return ls;
13    }
14}