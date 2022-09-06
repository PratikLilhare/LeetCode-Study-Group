class Solution {
    public String restoreString(String s, int[] indices) {
        int l=s.length();
        String h="";
        int size=indices.length;
        String arr[]=new String[size];
        for(int i=0;i<l;i++)
        {
           char a=s.charAt(indices[i]);
            char b=s.charAt(i);
            arr[indices[i]]=b+"";
        }
        for(int i=0;i<size;i++)
        {
            h=h+arr[i];
        }
        return h;
    }
}