class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2>len1){
            return -1;
        }
        if(len2==0 ){
            return 0;
        }
        int pointer =0;
        int cnt =0;
        for(int i =0 ; i< len1;i++){
            char c = haystack.charAt(i);
            pointer =i;
            
            while(c == needle.charAt(cnt)){
                  cnt++;
                if(cnt==len2){
                    return i;
                }
                if(pointer+1 == len1){
                    return -1;
                }
                c = haystack.charAt(++pointer);

            }
            cnt=0;
        }
        return -1;
    }
}