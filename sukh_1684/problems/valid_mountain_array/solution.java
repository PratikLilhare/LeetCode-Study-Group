class Solution {
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len<3){
            return false;
        }
        int k = 0;
        for(int i=1;i<len;i++){
            if(arr[i-1]>=arr[i]){
                break;
            }
            k=i;
        }
        System.out.println(k);
        if(k==0 || k == len-1){
            return false;
        }
        for(int i=k;i<len-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}