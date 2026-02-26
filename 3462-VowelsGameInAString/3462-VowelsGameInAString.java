// Last updated: 26/02/2026, 14:03:47
class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(ch=='i'||ch=='o'||ch=='u'||ch=='a'||ch=='e'){
                return true;
            }
        }
        return false;
        
    }
}