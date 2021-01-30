class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
         for(int i=0;i<s.length();i++){
             char c= s.charAt(i);
             a.put(c,a.getOrDefault(c,0)+1);
         }
                 for(int i=0;i<s.length();i++){
                                  char c= s.charAt(i);
                     if(a.get(c)==1){
                         return i;
                     }
                     
                 }
        return -1;
    }
}