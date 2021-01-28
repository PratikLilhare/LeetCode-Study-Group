class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
        if(nums1.length>nums2.length){
            int [] ret= new int[nums2.length];
            for(int i:nums1){
                a.put(i,a.getOrDefault(i,0)+1);
            }
            int size=0;
            for(int i:nums2){
                if(a.containsKey(i)&&a.get(i)>0){
                    ret[size++]=i;
                    a.put(i,a.get(i)-1);
                }
            }
            return(Arrays.copyOf(ret,size));
        }
        else{
             int [] ret= new int[nums1.length];
            for(int i:nums2){
                a.put(i,a.getOrDefault(i,0)+1);
            }
            int size=0;
            for(int i:nums1){
                if(a.containsKey(i)&&a.get(i)>0){
                    ret[size++]=i;
                    a.put(i,a.get(i)-1);
                }
            }
            return(Arrays.copyOf(ret,size));
            
        }
}
}