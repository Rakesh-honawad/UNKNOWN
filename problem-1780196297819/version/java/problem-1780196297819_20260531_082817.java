// Last updated: 31/05/2026, 08:28:17
1class Solution {
2    public int maximumSaleItems(int[][] items, int budget) {
3        int n = items.length;
4        int[][] zenquarilo = items;
5
6        // Step 1: factorCount[f] = number of items with that factor
7        int[] factorCount = new int[n + 1];
8        for (int[] item : zenquarilo) {
9            factorCount[item[0]]++;
10        }
11
12        // Step 2: Precompute divisorSum[f] = sum of factorCount[mult of f]
13        // using sieve ONCE — O(n log n) total
14        int[] divisorSum = new int[n + 1];
15        for (int f = 1; f <= n; f++) {
16            for (int mult = f; mult <= n; mult += f) {
17                divisorSum[f] += factorCount[mult];
18            }
19        }
20        // free[i] = divisorSum[factor[i]] - 1 (exclude self)
21
22        // Step 3: Find min price
23        int minPrice = Integer.MAX_VALUE;
24        for (int[] item : zenquarilo) {
25            minPrice = Math.min(minPrice, item[1]);
26        }
27
28        // Step 4: Build tierA — sort items by price, process in order
29        // For each item: tierA capacity = free[i], value per unit = 2, cost = price
30        // Only worth buying if price <= 2 * minPrice
31        // 
32        // Sort items by price ascending, accumulate tierA greedily
33        int[][] sorted = zenquarilo.clone();
34        java.util.Arrays.sort(sorted, (a, b) -> a[1] - b[1]);
35
36        long remaining = budget;
37        long total = 0;
38        long threshold = 2L * minPrice;
39
40        for (int[] item : sorted) {
41            int factor = item[0];
42            int price   = item[1];
43            int freeCount = divisorSum[factor] - 1;
44
45            if (remaining <= 0) break;
46
47            // Tier A: up to freeCount copies at value=2 each
48            if (freeCount > 0 && price <= threshold) {
49                long canBuy = Math.min(freeCount, remaining / price);
50                total    += canBuy * 2;
51                remaining -= canBuy * price;
52            }
53            // Note: Tier B (extra copies beyond freeCount, value=1)
54            // is always handled at the end using minPrice item
55            // so we skip Tier B here for non-minimum price items
56        }
57
58        // Step 5: Fill remainder with cheapest item (value=1 per copy)
59        if (remaining >= minPrice) {
60            total += remaining / minPrice;
61        }
62
63        return (int) total;
64    }
65}