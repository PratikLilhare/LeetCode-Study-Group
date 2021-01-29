class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1){
                return true;
            }
            else{
                return false;
            }
        }
        
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        if(flowerbed.length==2)
        {
            if(n==0)
                return true;
            else
                return false;
        }
        
        int length=flowerbed.length;
        if((flowerbed[length-2]==0) && (flowerbed[length-1]==0)){
            flowerbed[length-1]=1;
            n--;
        }
        
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                System.out.println(i);
                flowerbed[i]=1;
                n--;
            }
        }
        if(n<=0)
            return true;
        return false;
        
    }
}