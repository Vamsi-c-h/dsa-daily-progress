/*
Problem: Move Zeros
Link: https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
*/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j] = 0;
            j++;
        }
    }
}