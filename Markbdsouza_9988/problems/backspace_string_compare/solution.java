class Solution {
    public boolean backspaceCompare(String s, String t) {
        int sP = s.length() - 1;
        int tP = t.length() - 1;
        int sBCount = 0, tBCount =0;
        while(sP>=0 && tP>=0){
            if(s.charAt(sP) == '#'){
                sBCount++; sP--; continue;
            } 
            if(sBCount>0){
                sP--; sBCount--; continue;
            }
            if(t.charAt(tP) == '#'){
                tBCount++; tP--; continue;
            } 
            if(tBCount>0){
                tP--;  tBCount--;continue;
            }
            if(s.charAt(sP) != t.charAt(tP)) return false;
            sP--; tP--;
        }
        while(sP>=0){
            if(s.charAt(sP) == '#'){
                sBCount++; sP--; continue;
            } 
            if(sBCount>0){
                sP--; sBCount--; continue;
            } else return false; 
        }
        while(tP>=0){
             if(t.charAt(tP) == '#'){
                tBCount++; tP--; continue;
            } 
            if(tBCount>0){
                tP--;  tBCount--;continue;
            } else return false; 
        }
        return true;

    }
}