class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String s=strs[0];
          int i;
      
        for( i=0;i<s.length();i++){
            char c=s.charAt(i);

            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==0){
                    return "";
                }
                if(strs[j].length()==i){
                    return s.substring(0,i);
                }
                if(c!=strs[j].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
                if(i==s.length()){
                        return s;
                    }
        
      return "" ;
    }
}