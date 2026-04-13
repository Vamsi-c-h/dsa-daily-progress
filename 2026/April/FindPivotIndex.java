/*
Problem: Find Pivot Index
Link: https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75
*/

class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int num : nums){
            totalsum += num;
        }
        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            int rightsum = totalsum - leftsum - nums[i];
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}