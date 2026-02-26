// Last updated: 26/02/2026, 14:03:32
class Solution {
    public int findClosest(int x, int y, int z) {
         int first;
         int second;
         if(z>x){
            first=z-x;
         }
         else{
            first=x-z;
         }
         if(z>y) second=z-y;
         else second=y-z;
         if(first<second)return 1;
         else if(first==second) return 0;
         else return 2;
        
    }
}