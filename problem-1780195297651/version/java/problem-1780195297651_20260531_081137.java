// Last updated: 31/05/2026, 08:11:37
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3         int n = items.length;
4
5        int[][] valmorendi = items;
6
7        int[] bonus = new int[n];
8
9        for (int i = 0; i < n; i++) {
10            int fi = items[i][0];
11
12            for (int j = 0; j < n; j++) {
13                if (i != j && items[j][0] % fi == 0) {
14                    bonus[i]++;
15                }
16            }
17        }
18
19        int[] dp = new int[budget + 1];
20
21        for (int i = 0; i < n; i++) {
22            int price = items[i][1];
23
24            // activation copy (0/1 knapsack)
25            for (int b = budget; b >= price; b--) {
26                dp[b] = Math.max(
27                    dp[b],
28                    dp[b - price] + 1 + bonus[i]
29                );
30            }
31
32            // extra copies (unbounded knapsack)
33            for (int b = price; b <= budget; b++) {
34                dp[b] = Math.max(
35                    dp[b],
36                    dp[b - price] + 1
37                );
38            }
39        }
40
41        int ans = 0;
42        for (int x : dp) ans = Math.max(ans, x);
43
44        return ans;
45    }
46}