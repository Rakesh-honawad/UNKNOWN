// Last updated: 21/04/2026, 21:27:37
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if (people == null || people.length == 0) {
            return 0;
        }

        int m = 0;
        for (int p : people) {
            m = Math.max(m, p);
        }

        int[] count = new int[m + 1];
        for (int p : people) {
            count[p]++;
        }

        int index = 0, i = 1;
        while (index < people.length) {
            while (count[i] == 0) {
                i++;
            }
            people[index++] = i;
            count[i]--;
        }

        int l = 0, r = people.length - 1, res = 0;
        while (l <= r) {
            int remain = limit - people[r--];
            res++;
            if (l <= r && remain >= people[l]) {
                l++;
            }
        }

        return res;
    }
}