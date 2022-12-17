class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2= t.length();
        if(len1!= len2){
            return false;
        }
           HashMap<Character,Integer> check = new HashMap<>();
          for(int i=0;i<len1;i++){
              char c = s.charAt(i);
              check.put(c,check.getOrDefault(c,0)+1);
          }
        for(int i=0;i<len2;i++){
            char c = t.charAt(i);
            if(!check.containsKey(c)){
                return false;
            }
            int temp = check.get(c)-1;
            if(temp == -1){
                return false;
            }
            check.put(c,temp);
        }
        
        
        return true;
    }
}