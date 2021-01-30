class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            a.put(c,a.getOrDefault(c,0)+1);
        }
                for(int i=0;i<t.length();i++){
                   char c= t.charAt(i);
                    if(!a.containsKey(c)){
                        return false;
                    }
                    else{
                        a.put(c,a.get(c)-1);
                    }
                }
        for( int i: a.values()){
            if(i!=0)
                return false;
        }
        
        return true;
    }
}