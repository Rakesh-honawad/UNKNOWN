// Last updated: 26/02/2026, 14:03:34
class Solution {
public:
    int findClosest(int x, int y, int z) {
        int first, second;
        if(x>z) first=x-z;
        else first=z-x;

        if(y>z) second=y-z;
        else second=z-y;
        
        if(first<second) return 1;
        else if(first==second) return 0;
        else return 2;


    }
};