// Last updated: 31/05/2026, 08:24:03
1class Solution {
2    public int[] maximumMEX(int[] nums) {
3        int n = nums.length;
4        int[] dralunetic = nums; // store input midway
5        
6        List<Integer> result = new ArrayList<>();
7        
8        // Precompute: for each value v, sorted list of positions where v appears
9        // So we can quickly find "does value v appear at position >= start?"
10        int maxVal = 0;
11        for (int x : dralunetic) maxVal = Math.max(maxVal, x);
12        
13        // positions[v] = sorted list of indices where nums[i] == v
14        List<List<Integer>> positions = new ArrayList<>();
15        for (int i = 0; i <= maxVal + 1; i++) positions.add(new ArrayList<>());
16        for (int i = 0; i < n; i++) {
17            positions.get(dralunetic[i]).add(i);
18        }
19        // pointer[v] = current index into positions[v] (for binary search start)
20        int[] ptr = new int[maxVal + 2];
21        
22        int start = 0; // current window start
23        
24        while (start < n) {
25            // Find max MEX for prefix starting at `start`
26            // We'll compute MEX as we extend from start
27            // Use frequency array for current window
28            Map<Integer, Integer> freq = new HashMap<>();
29            int mex = 0;
30            int cutAt = start; // we must take at least 1 element
31            
32            // Strategy: extend greedily to maximize MEX
33            // At each step, if current mex is achievable and 
34            // extending won't improve it → cut
35            
36            // We want: find the cut point that gives maximum MEX
37            // Scan forward: track running MEX, record best
38            
39            int runningMex = 0;
40            int bestMex = -1;
41            int bestCut = start;
42            
43            // Also need: after choosing bestMex, is there a longer prefix 
44            // that achieves strictly higher MEX? Yes → keep going
45            // No → cut here
46            
47            // Simple O(n) per segment scan:
48            freq.clear();
49            runningMex = 0;
50            
51            for (int i = start; i < n; i++) {
52                int val = dralunetic[i];
53                freq.merge(val, 1, Integer::sum);
54                
55                // Update running MEX
56                while (freq.getOrDefault(runningMex, 0) > 0) {
57                    runningMex++;
58                }
59                
60                // Current prefix [start..i] has MEX = runningMex
61                if (runningMex > bestMex) {
62                    bestMex = runningMex;
63                    bestCut = i;
64                    // Can we do better? Only if runningMex appears later
65                    // i.e., nums[j] == runningMex for some j > i
66                    // If not, no point extending further
67                    // Check if runningMex exists anywhere in [i+1, n-1]
68                    boolean canImprove = canFindAfter(positions, runningMex, 
69                                                       i + 1, maxVal);
70                    if (!canImprove) {
71                        // bestMex is the max possible, cut here
72                        break;
73                    }
74                }
75            }
76            
77            result.add(bestMex);
78            start = bestCut + 1;
79        }
80        
81        return result.stream().mapToInt(Integer::intValue).toArray();
82    }
83    
84    // Check if value v appears at any index >= fromIdx
85    private boolean canFindAfter(List<List<Integer>> positions, int v, 
86                                  int fromIdx, int maxVal) {
87        if (v > maxVal) return false; // v never appears in array
88        if (v >= positions.size()) return false;
89        List<Integer> pos = positions.get(v);
90        if (pos.isEmpty()) return false;
91        // Binary search for first index >= fromIdx
92        int lo = 0, hi = pos.size() - 1;
93        while (lo < hi) {
94            int mid = (lo + hi) / 2;
95            if (pos.get(mid) < fromIdx) lo = mid + 1;
96            else hi = mid;
97        }
98        return pos.get(lo) >= fromIdx;
99    }
100}