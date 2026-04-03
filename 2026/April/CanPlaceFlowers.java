/*
Problem: Greatest Common Divisor of Strings
Link: https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
*/
class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        int len = flowerbed.length;


        for(int i=0; i<len; i++){
            if(flowerbed[i] == 0){
                int prev = (i==0) ? 0 : flowerbed[i-1];
                int next = (i==len-1) ? 0 : flowerbed[i+1];

                if(prev == 0 && next == 0){
                    flowerbed[i] = 1;
                    c++;
                }
            }

            
        }

        return c>=n;
        
    }
}