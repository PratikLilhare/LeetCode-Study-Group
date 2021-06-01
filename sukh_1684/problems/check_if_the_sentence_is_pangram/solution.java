class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] alphabets = new boolean [26];
        for (int i=0;i<sentence.length();i++){
            char temp = sentence.charAt(i);

            alphabets[temp-97]=true;
        }
        for(int i=0;i<26;i++){
            if(alphabets[i]==false)
                return false;
        }
        return true;
    }
}